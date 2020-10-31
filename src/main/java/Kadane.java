public class Kadane {

    static int findMaxSum(int[]arr){
      int max_sum = arr[0];
      int current_sum = max_sum;
      int startIndex = 0;
      int endIndex = 0;
      for(int i=1; i<arr.length; i++){
          current_sum = Math.max(arr[i]+current_sum,arr[i]);
          if(current_sum > max_sum){
              startIndex = i-1;
              endIndex = i;

          }
          max_sum = Math.max(current_sum, max_sum);

      }
      System.out.printf("the max summary is %d + %d\n", arr[startIndex],arr[endIndex]);
      return max_sum;
    }
    public static void main(String[] args) {
        int[]inputArr = {-2,2,5,-11,6};
        System.out.println(findMaxSum(inputArr));

    }
}
