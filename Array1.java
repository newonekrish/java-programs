import java.util.*;
public class Array1
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("array elements are:");
        for(int i=0;i<n;i++)
        {
           System.out.print("  "+a[i]); 
        }
        int b=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=b+a[i];
            b=sum;
        }
        System.out.println("\nsum is"+sum);
        List<Integer> e=new LinkedList<>();
        List<Integer> o=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                e.add(a[i]);
            }
            else{
                o.add(a[i]);
            }
        }
        Collections.sort(e);
        Collections.sort(o);
        System.out.println("even numbers in Array:"+(e));
        System.out.println("odd numbers in Array:"+o);
    }
}