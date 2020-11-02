public class FindMissingNumberInArray {

    public static void main(String[] args) {
        //int[]arr={3,4,5,1,6,7,8,9,10};
        int[]arr={1,3,4,2,6};
        //the expected length if the element is there
        int n = arr.length +1;
        System.out.println(findMissingArray(arr,n));
}

    private static int findMissingArray(int[] arr, int n) {
        int sum = n*(n+1)/2;
        for(int i = 0; i < n-1; i++){
            //expected summary with n
            sum = sum - arr[i];
        }
     return sum;
    }
    }
