import java.util.Scanner;

public class Question3 {
    public static void printNumber(int i, int n){

        if(i<1){
            return;//base case
        }

        System.out.println(i);
        printNumber(i-1, n);

    }
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int n = input.nextInt();
        int i = n;
        printNumber(i, n);//calling our recursive function

    }
}
