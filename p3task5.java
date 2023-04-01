import java.util.Scanner;
public class p3task5{
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
        System.out.print("The elements after moving ones to end: ");
        for(int i=0;i<n;i++)
        {
            if(x[i]!=1)System.out.print(x[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]==1)System.out.print(x[i]+" ");
        }
    }
}