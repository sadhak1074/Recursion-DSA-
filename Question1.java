import java.util.Scanner;

public class Question1{
    public static void printName(int i, int n){
        
        if(i>n){
            return;
        }//out base condition.
        
        System.out.println("sadhak");
        printName(i+1,n); //updating the function.
    
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //creating scanner object to take input from user.
        System.out.print("Enter a number: ");
        
        int n = input.nextInt();
        printName(1, n); //calling our recursive function.
    
    }
}