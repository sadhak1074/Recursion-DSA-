import java.util.Scanner;

public class Question12 {
    public static int fibb(int n){
        if(n<=1){
            return n;
        }

        return fibb(n-1)+fibb(n-2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //creating scanner object to take input from user.
        System.out.print("Enter a number: ");
        
        int n = input.nextInt();
        int result = fibb(n);
        System.out.println(result);
    }
}
