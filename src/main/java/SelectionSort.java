import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {0,1,19,44,38,19,5,47,15};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

   //from the smallest
    /*private static int[] selectionSort(int[] arr) {
        int lowest;
        for(int i = 0; i < arr.length; i++){
            lowest = i;
            for(int j = i+1; j < arr.length;j++){
                if (arr[j] < arr[lowest]){
                        lowest = j;
                }
            }

            if(i !=lowest){
                swap(arr,i,lowest);
            }
        }
        return arr;
    }*/

    private static int[] selectionSort(int[] arr){
        for(int i= arr.length -1; i > 0; i--){
            int biggest = i;
            for(int j = 0; j <= i; j++){
                if (arr[j] > arr[biggest]){
                    biggest = j;
                }
            }
            if(i != biggest){
                swap(arr,i,biggest);
            }
        }
        return arr;
    }


    private static void swap(int arr[], int i, int j){
        if(i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
