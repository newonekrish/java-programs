import java.util.*;

public class add{
    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: int sum, 2: float sum");
        int choice = sc.nextInt();

        System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = sum(a, b);
        System.out.println("Sum: " + (choice == 1 ? (int)result : (float)result));

        sc.close();
    }
}
