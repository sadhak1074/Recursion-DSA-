import java.util.Scanner;

public class Question4 {
    
    public static void printNum(int i, int n){

        if(i<1){
            return;//Base case
        }

        printNum(i-1, n);//here backtracking works
        System.out.println(i);

    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //creating scanner object to take input from user.
        System.out.print("Enter a number: ");
        
        int n = input.nextInt();
        int i = n;

        printNum(i, n);

    }
}
