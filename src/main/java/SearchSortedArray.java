import java.util.Arrays;

public class SearchSortedArray {
//from geek for geek & youtube
    public static void main(String[] args) {
        int[]testArray = {1,2,3,6,7,8,8,9,10};
        //System.out.println(Arrays.toString(searchRange(testArray,8)));
        System.out.println(Arrays.toString(searchRange(testArray,1)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[]result = new int[2];
        result[0]=findStartingIndex(nums,target);
        result[1]=findEndingIndex(nums,target);
        return result;
    }


    private static int findStartingIndex(int[] nums, int target) {
        int index= -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int midPoint = start+ (end-start)/2;

            if(nums[midPoint] >= target)
            {
                end = midPoint-1;
            }else{
                start = midPoint + 1;
            }

            if(nums[midPoint]== target) {
                index = midPoint;
            }
        }
        return index;
    }

    private static int findEndingIndex(int[] nums, int target) {
        int index= -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <=end){
            int midPoint = start + (end-start)/2;
            if(nums[midPoint] <= target){
                start = midPoint + 1;
            }else{
                end = midPoint -1;
            }

            if(nums[midPoint]== target) {
                index = midPoint;
            }
        }



        return index;
    }
    }

