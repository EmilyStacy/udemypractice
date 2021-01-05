import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
    int[] input = {20, 35, -15, 7, 55, 1, 22};
        System.out.println(Arrays.toString(quickSort(input, 0,input.length)));
    }

    private static int[] quickSort(int[]input, int start, int end){
        if(end - start < 2) {
            return input;
        }
        //find the sorting position after partition

        int pivotIndex = partition(input, start,end);

        //recursive call for left and right array from the pivot
        quickSort(input,start, pivotIndex);
        quickSort(input, pivotIndex+1, end);

        return input;
    }

    private static int partition(int[] input, int start, int end){
        //using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i < j){

            //empty loop body for right arr
            //decrement j before starting
            while (i < j && input[--j] >= pivot);
           //while will end will j is smaller than the pivot
            if (i < j){
                //move j < than pivot to the left
                input[i] = input [j];
            }

            //empty loop body for left arr
            //increment i before starting
            while (i < j && input[++i] <= pivot);
            if (i < j){
                input[j] = input[i];
            }

            }
            input [j] = pivot;

        return j;

    }
}
