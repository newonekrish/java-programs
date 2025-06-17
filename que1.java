import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class que1{
    public static void add(Scanner sc, Queue<Integer> q1) {
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            q1.add(sc.nextInt());
        }

        System.out.println("Queue contents (sorted): " + q1.poll());
        System.out.println("Queue contents (sorted): " + q1);
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        add(sc, q1);
        sc.close();
    }
}