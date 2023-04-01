import java.util.Scanner;
public class p3task2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[];
		int n=sc.nextInt();
		x=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
        System.out.println("The elements in reverse order: ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(x[i]+" ");
        }
        
    }
}