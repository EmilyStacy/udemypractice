public class FindLeadersInArray {

    public static void main(String[] args) {
        int[]arr = new int[] {16,17,4,3,5,5,2};
        System.out.println(printLeaders(arr));
    }

    private static int printLeaders(int[] arr) {
        int maxPointer = arr[arr.length-1];
        int maxPointerCounts = 1;
        System.out.println("maxPointer now is " + maxPointer);

        for(int i= arr.length-2;i>=0; i--){
          if(arr[i] >= maxPointer){
              maxPointer = arr[i];
              maxPointerCounts++;
              System.out.println("maxPointer now is " + maxPointer);
          }
        }
        return maxPointerCounts;
    }
}
