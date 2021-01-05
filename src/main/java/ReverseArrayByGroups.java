import java.util.Arrays;

public class ReverseArrayByGroups {


    public static void main(String[] args) {
//        int[] arr = new int []{1,2,3,4,5,6,7,8,9};
////        int k = 3;
//        int[] arr = new int []{1,2,3,4,5,6,7,8};
//        int k = 5;
//        int[] arr = new int []{1,2,3,4,5,6,7,8};
//        int k = 10;
        int[] arr = new int []{1,2,3,4,5,6};
        int k = 1;
        System.out.println(Arrays.toString(reverseByGroup(arr,k)));

    }

    private static int[] reverseByGroup(int[] arr, int k) {
        if(k<=0) return new int[]{};
        for(int i=0; i< arr.length; i+=k){
            int start = i;
            int end = Math.min(i+k-1,arr.length-1);
            while(start <= end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start ++;
                end --;
            }
        }
        return arr;
    }
}
