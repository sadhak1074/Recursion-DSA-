import java.util.Scanner;

public class Question5 {
    public static void printNum(int i, int n){
        if(n<i){
            return;
        }
        printNum(i+1, n);
        System.out.println(i);
    }   
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //creating scanner object to take input from user.
        System.out.print("Enter a number: ");
        
        int n = input.nextInt();
        printNum(1, n);
    }
}
