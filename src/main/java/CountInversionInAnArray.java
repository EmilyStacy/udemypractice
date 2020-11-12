import java.util.Arrays;

public class CountInversionInAnArray {

    //using merge sort
    //break down array into 2 pieces, left compared to right, and then merge 2/3 elements from the other side
    public static void main(String[] args) {
//        int[] arr = new int[] {1,20,6,4,5};
        int[] arr = new int[] {1,20,6,7,5,8,11,3};
        System.out.println("Numbers of inversions are" + mergeSort(arr,5));

    }

    private static int mergeSort(int[] arr, int arraySize) {

        int[]temp = new int[arraySize];
        return _mergeSort(arr,temp,0,arraySize-1);
    }


    //recursive method to find out the total number of inversions in an array
    private static int _mergeSort(int[] arr, int[] temp, int left, int right) {
        int mid = 0;
        int inv_count = 0;

        //divide the array into two parts using the variable mid
        if(right > left) {
            mid = (right + left) /2;

            //count times of inversion in left, right  and when they combine
            inv_count += _mergeSort(arr,temp,left,mid);
            inv_count +=_mergeSort(arr,temp,mid+1, right);
            inv_count+= merge(arr,temp,left, mid+1,right );
        }

        return inv_count;
    }


    private static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        //index for left subarray
        System.out.println("temp now is" + Arrays.toString(temp))   ;
        int i,j,k;
        int inv_count = 0;
        i = left;
        //index for right subarray
        j = mid;
        //index for the result merged subarray
        k = left;

        while((i <= mid -1) && (j <=right)){
            if(arr[i] <=arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
                inv_count+=(mid-i);
            }
        }

        //copy the rest of left arr to temp
        while(i <= (mid-1)){
            temp[k++] = arr[i++];
        }

        //copy the rest of right arr to temp
        while(j<=right){
            temp[k++] = arr[j++];

        }

        //copy back the merged element to the original element
        for (i = left; i <=right; i++){
            arr[i] = temp[i];
        }

        return inv_count;

    }


}
