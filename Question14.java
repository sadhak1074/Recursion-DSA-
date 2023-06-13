import java.util.ArrayList;

public class Question14{
public static void printSubsequence(int[] arr, int index, ArrayList<Integer> ds,int sum,int k){
        // base case
        if(index==arr.length){
                if(sum==k){
                    System.out.println(ds);

                }
            return ;
        }
        ds.add(arr[index]);// add to array list
        sum = sum + arr[index];
        printSubsequence(arr, index+1, ds,sum,k);  // pick an element
        ds.remove(ds.size()-1);// remove from array list
        sum = sum - arr[index];
        printSubsequence(arr, index+1, ds,sum,k);// not pick
    }
    public static void main(String args[]) {
        int n = 3;
        int arr [] = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        int sum =0;
        int k=2;
        printSubsequence(arr,0,list, sum,k);

    }
}