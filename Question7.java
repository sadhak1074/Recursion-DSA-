import java.util.Scanner;

public class Question7 {
    public static void sum(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1, sum+i);
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int n = input.nextInt();
        sum(n, 0);
    }
}
