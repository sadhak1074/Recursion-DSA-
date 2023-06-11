public class Question10 {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array, 0);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
    
    public static void reverseArray(int[] array, int i){
        if(i >= array.length / 2){
            return;
        }
        
        int temp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = temp;

        reverseArray(array, i + 1);
    }
}
