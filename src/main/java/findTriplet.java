import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findTriplet {
    /*traditinal way
    static boolean findTriplet(int[]arr, int sum) {

        if (arr.length < 3) {
            return false;
        }

        Arrays.sort(arr);
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int start = i + 1;
            int end = len - 1;
            while (start < end) {
                if(arr[i] + arr[start]+arr[end] == sum){
                    System.out.printf("the sum of %d is %d,%d,%d", sum,arr[i],arr[start],arr[end]);
                    return true;
                }else if (arr[i] + arr[start]+arr[end] < sum){
                    start ++;
                }else{
                    end --;
                }
            }

        }
        System.out.println("pair not exist");
        return false;
    }

     */
    static void findTriplet(int arr[], int sum){
        int length = arr.length;
        int isAdded = 0;
        for(int i =0; i < length -1; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i+1; j< length;j++){
                int x = sum - (arr[i] + arr[j]);
                if(set.contains(x)){
                    System.out.printf(
                            "%d %d %d\n", x, arr[i], arr[j]);
                    isAdded ++;
                }else{
                    set.add(arr[j]);
                }
            }


        }

        if(isAdded ==0){
            System.out.println("No match");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,15,6,10,8};
        findTriplet(arr,13);
        //int[] arr = {2,7,4,0,9,5,1,3};
        //findTriplet(arr,6);


    }
}
