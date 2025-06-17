import java.util.Scanner;
public class skip
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]!=v)
            {
                b[i]=a[i];
                i++;
            }
            else
            {
                System.out.println(b[i]);
            }
        }
    }
}