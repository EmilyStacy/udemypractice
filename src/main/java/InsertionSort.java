import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr = {2,1,9,76,4};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int tempValue = arr[i];
            int j;
            for(j = i - 1; j >= 0 && arr[j] > tempValue; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = tempValue;
        }
        return arr;
    }
}
