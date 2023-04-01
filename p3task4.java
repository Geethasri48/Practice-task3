import java.util.Scanner;
public class p3task4{
    public static boolean prime(int n)
    {
    int c=0;
    for(int i=2;i<=(int)Math.sqrt(n);i++)
    {
        if(n%i==0)return false;
    }
    return true;
    }
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
        int max=0,res=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]>max )
            {
                max=x[i];
                if(prime(max))res=max;
            }
        }
        System.out.print("The largest prime number in given array: "+res);
    }
}