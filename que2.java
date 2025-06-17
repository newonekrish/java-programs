import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class que2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> remainingElements = new ArrayList<>();
        
        // Taking 10 elements input
        System.out.println("Enter the elements:");
        for (int i = 0; i < s ; i++) {
            q.add(sc.nextInt());
        }
        
        // Asking for 'n' (number of last elements to print)
        System.out.print("Enter the number of last elements to display: ");
        int n = sc.nextInt();
        
        // Transferring last N elements to a list
        ArrayList<Integer> lastN = new ArrayList<>(q);
        int size = lastN.size();
        
        System.out.println("\nLast " + n + " elements in the queue:");
        for (int i = size - n; i < size; i++) {
            System.out.print(lastN.get(i) + " ");
        }
        
        // Storing remaining elements in another array
        for (int i = 0; i < size - n; i++) {
            remainingElements.add(lastN.get(i));
        }
        
        System.out.println("\nRemaining elements stored in array:");
        System.out.println(remainingElements);
        
        sc.close();
    }
}