public class FindKthSmallestElement {
    //use randomized+quickSelect     approach
    public static void main(String[] args) {
        int arr[] = {12, 3, 5, 7, 4, 19, 26};
        int arrLength = arr.length;
        //int k = 3;
        int k = 4;
        System.out.println("Kth smallest element is " + findSmallest(arr,0,arrLength-1,k));
    }

    private static int findSmallest(int[] arr, int startIndex, int endIndex, int k) {
        if (k > 0 && k<= endIndex-startIndex+1){
            //randomly pick up an index as the pivot and sort
            int position = randomPartition(arr, startIndex,endIndex);
            if(position-startIndex== k-1){
                return arr[position];
            }

            if(position-startIndex >k-1){
                // If position is more, recur for left subarray
                return findSmallest(arr,startIndex,position-1,k);
            }
            //or else starting from the right; when finding the largest, to keep finding kth when the pos are changing
            //if k = 8, position =3 , arr length = 10
            //now sort from 4 to 10 looking for origin index 7/current index 3;
            //8-3+4-1= 8
            return findSmallest(arr,position+1,endIndex,k-position+startIndex-1);
        }
        return Integer.MAX_VALUE;
    }

    private static int randomPartition(int[] arr, int startIndex, int endIndex) {
        int n = endIndex-startIndex+1;
        //make sure the range is between the endIndex and startIndex
        int pivot = (int)(Math.random()) * (n-1);
        swap(arr,startIndex+pivot,endIndex);
        // Standard partition process of QuickSort(). It considers
        // the last element as pivot and moves all smaller element
        // to left of it and greater elements to right.
        return partition(arr,startIndex,endIndex);
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int x = arr[endIndex];
        int i = startIndex;
        for(int j = startIndex; j <=endIndex-1;j++){
            if(arr[j]<=x){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,endIndex);
        return i;
    }

    // Utility method to swap arr[i] and arr[j]
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
}
/*class KthSmallst
{
    // This function returns k'th smallest element in arr[startIndex..endIndex]
    // using QuickSort based method. ASSUMPTION: ALL ELEMENTS
    // IN ARR[] ARE DISTINCT
    int kthSmallest(int arr[], int startIndex, int endIndex, int k)
    {
        // If k is smaller than number of elements in array
        if (k > 0 && k <= endIndex - startIndex + 1)
        {
            // Partition the array around a random element and
            // get position of pivot element in sorted array
            int pos = randomPartition(arr, startIndex, endIndex);

            // If position is same as k
            if (pos-startIndex == k-1)
                return arr[pos];

            // If position is more, recur for left subarray
            if (pos-startIndex > k-1)
                return kthSmallest(arr, startIndex, pos-1, k);

            // Else recur for right subarray
            return kthSmallest(arr, pos+1, endIndex, k-pos+startIndex-1);
        }

        // If k is more than number of elements in array
        return Integer.MAX_VALUE;
    }

    // Utility method to swap arr[i] and arr[j]
    void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Standard partition process of QuickSort(). It considers
    // the last element as pivot and moves all smaller element
    // to left of it and greater elements to right. This function
    // is used by randomPartition()
    int partition(int arr[], int l, int r)
    {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++)
        {
            if (arr[j] <= x)
            {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }

    // Picks a random pivot element between l and r and
    // partitions arr[l..r] arount the randomly picked
    // element using partition()
    int randomPartition(int arr[], int l, int r)
    {
        int n = r-l+1;
        int pivot = (int)(Math.random()) * (n-1);
        swap(arr, l + pivot, r);
        return partition(arr, l, r);
    }

    // Driver method to test above
    public static void main(String args[])
    {
        KthSmallst ob = new KthSmallst();
//        int arr[] = {12, 3, 5, 7, 4, 19, 26};
//        int n = arr.length,k = 3;
//        System.out.println("K'th smallest element is "+
//                ob.kthSmallest(arr, 0, n-1, k));

        int arr[] = {12, 3, 5, 7, 4, 19, 26};
        int arrLength = arr.length;
        int k = 4;
        System.out.println("Kth smallest element is " + ob.kthSmallest(arr,0,arrLength-1,k));

    }
}*/
/*This code is contributed by Rajat Mishra*/