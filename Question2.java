import java.util.Scanner;

public class Question2 {

    public static void printNum(int i, int n){
        if(i>n){
            return;//Base condition
    }
    
    System.out.println(i);
    printNum(i+1, n);
}
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in); //creating scanner object to take input from user.
        System.out.print("Enter a number: ");
        
        int n = input.nextInt();
        printNum(1, n);//Calling our recursive function
    
    }
}
