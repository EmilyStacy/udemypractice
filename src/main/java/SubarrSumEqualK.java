import java.util.HashMap;
import java.util.Map;

public class SubarrSumEqualK {
    public static void main(String[] args) {
        //int[]arr = {1,1,1,1,-1};
        int[]arr = {3,4,7,2,-3,1,4,2};
        System.out.println(subarraySum(arr,7));
    }

    static int subarraySum(int[]nums, int k){
        //make a hashmap to store the sum and the frequency, including 0
        Map<Integer,Integer> arr_sums = new HashMap<>();
        arr_sums.put(0,1);
        int sum = 0;
        int subarrCount = 0;
        for(int i =0; i<nums.length; i++){
            sum+=nums[i];

            if(arr_sums.containsKey(sum-k)){
                subarrCount+=arr_sums.get(sum-k);
            }
            //deal with negative number
            arr_sums.put(sum,arr_sums.getOrDefault(sum,0)+1);

        }

        return subarrCount;
    }
}
