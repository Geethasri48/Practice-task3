import java.util.Scanner;
public class p3task3{
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
        System.out.println("The elements in ascending order: ");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int t=0;
                if(x[i]>x[j])
                {
                    t=x[i];
                    x[i]=x[j];
                    x[j]=t;
                }
            }
            System.out.print(x[i]+" ");
        }
        System.out.println("The elements in descending order: ");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int t=0;
                if(x[i]<x[j])
                {
                    t=x[i];
                    x[i]=x[j];
                    x[j]=t;
                }
            }
            System.out.print(x[i]+" ");
        }
    }
}