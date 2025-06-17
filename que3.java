import java.util.*;
public class que3
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer> q=new PriorityQueue();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            q.add(sc.nextInt());
        }
        System.out.println("queue elements are:"+q);
        System.out.println("enter the number elements to be displayed in queue:");
        int n1=sc.nextInt();
        for(int i=0;i<n-n1;i++)
        {
            
        }
    }
}