import java.util.Scanner;
public class p3task6{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[];
        // 17
        System.out.print("Enter the length of Super set Array: ");
		int n=sc.nextInt();
        // 3 1 3 4 1 2 1 8 3 2 1 1 3 2 3 3 4
        System.out.print("Enter the Super set Array elemets: ");
		x=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
        // 5
        System.out.println("Enter the length of Sub set Array: ");
		int m=sc.nextInt();
        // 1 2 3 5 9
        System.out.println("Enter the Sub set Array elemets: ");
        int y[]=new int[m];
        int c=0;
		for(int i=0;i<m;i++)
		{
			y[i]=sc.nextInt();
		}
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(y[i]==x[j])c++;
            }
            System.out.println("Frequency of "+y[i]+" : "+c);
            c=0;
        } 

    }
}