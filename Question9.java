import java.util.Scanner;

public class Question9 {
    public static int fac(int n){
        if(n==1){
            return 1;
        }
        return n + fac(n-1);
    }
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int result = fac(n);
        System.out.println("Factorial of the number " + n + ": " + result);
    }
}
