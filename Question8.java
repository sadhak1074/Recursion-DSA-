import java.util.Scanner;

public class Question8 {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        
        int result = sum(n);
        System.out.println("Sum of the numbers from 1 to " + n + ": " + result);
    }
}
