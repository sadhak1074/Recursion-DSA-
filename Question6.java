import java.util.Scanner;

public class Question6 {
    public static void pow(int i, int n){
        if(i==0){
            return;
        }
        if(i==1){
            System.out.println(n);
            return;
        }
        System.out.println(Math.pow(i, n));
        pow(i-i, n);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //creating scanner object to take input from user.
        System.out.print("Enter a number: ");
        
        int n = input.nextInt();

        Scanner input2 = new Scanner(System.in); //creating scanner object to take input from user.
        System.out.print("Enter a number: ");
        int i = input2.nextInt();
        pow(i, n);
    }
}
