public class DuplicateNumberSearch {

    //mutable array: mark index as negative and find the first that repeats
  /*
   static int findDuplicate(int[]arr){

   for(int i =0; i < arr.length; i++){
   if(arr[abs(arr[i])] - 1 >= 0){
    arr[abs(arr[i])-1] = -arr[abs(nums[i])-1];
   }else{
     return abs(arr[i])
   }

   }

   return 0;
   }



   */
    //unmutable array: linked list
    static int findDuplicate(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int slow = arr[0];
        int fast = arr[0];

        slow = arr[slow];
        fast = arr[arr[fast]];

        //first run to find the interaction point; finding the cycle starts
        while(fast!=slow){
            slow = arr[slow];
            fast = arr[arr[fast]];

        }
        // the loop finishes, send the slow back to the beginning; send the fast pointer as slow
        int new_slow_pointer = arr[0];
        int new_fast_pointer = slow;

        while(new_slow_pointer != new_fast_pointer){
            new_slow_pointer = arr[new_slow_pointer];
            new_fast_pointer = arr[new_fast_pointer];
        }

        return new_slow_pointer;
    }




    public static void main(String[] args) {
        //int[]numArr = {1,3,4,2,2};
        //int[]numArr = {3,1,3,4,2};
        int[]numArr = {3,2,3,3,3};
        System.out.println(findDuplicate(numArr));
        //n+1 with n number, a number might appear twice
        // o(1) for space and less than O(n2) for time
        //read only
        //

    }
}
