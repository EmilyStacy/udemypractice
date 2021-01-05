import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {1,6,15,33,39,48,36};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {
        boolean noswap;
        for(int i = arr.length; i > 0; i--){
            noswap = true;
            for(int j = 0; j < i-1; j++){
                if (arr[j] > arr[j+1]){
                    noswap = false;
                    swap(arr,j,j+1);
                }

            }
            if (noswap == true) break;
        }
        return arr;
    }


    private static void swap(int arr[], int i, int j){
        //if(i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
