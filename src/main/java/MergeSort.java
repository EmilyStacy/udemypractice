public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {20,45, -15,7,55,1,-22};
        mergeSort(arr,0,arr.length);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        //breaking point
        if(end - start < 2){
            return;
        }

        //partition
        int mid = (start + end) / 2;

        mergeSort(arr,start, mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);
    }

    private static void merge(int[]arr,int start, int mid, int end){

        //last element in left smaller than the first element in right
        if(arr[mid -1] <= arr[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[]temp = new int[end - start];

        while(i < mid && j < end){
            //tempIndex ++ = temp[tempIndex] then tempIndex+1;
            temp[tempIndex++] = arr[i] <= arr[j]? arr[i++]:arr[j++];
        }
        /*if there is any leftover element in left, it means it is bigger than all
        the other copied elements, so copy it back to the original array and find the right
        position by start+tempIndex(last tempIndex shows the length of the temp arr)
         */
        System.arraycopy(arr,i,arr,start + tempIndex,mid-i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }
}
