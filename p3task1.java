import java.util.Scanner;
public class p3task1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i;
		int n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
        int max=0,min=999,c=0,s=0;
		for(i=0;i<n;i++)
		{
			// System.out.print(x[i]+" ");
            if(x[i]>max)max=x[i];
            if(x[i]<min)min=x[i];
            s+=x[i];
            c+=1;
		}
        System.out.println("The element with the minimum value: "+min);
        System.out.println("The element with the maximum value: "+max);
        System.out.println("Average of all the array elements: "+s/c);
        System.out.println("Total number of array elements: "+c);
    }
}