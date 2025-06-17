import java.util.Scanner;
public class digits
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
            if(a[n-1]<9)
            {
                a[n-1]++;
            }
            else
            {
                int newarr[] = new int[n+1];
                for(int i=0;i<n-1;i++)
                {
                    newarr[i]=a[i];
                }
                newarr[n-1]=1;
                newarr[n]=0;
                a = newarr;
            }
        System.out.println("after modification:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}