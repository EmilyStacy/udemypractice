public class PrintOutMissingElements {
    public static void main(String[] args) {
        int arr[] = {88, 105, 3, 2, 200, 0, 10};
        int n = arr.length;
        printMissing(arr, n);
    }

    private static void printMissing(int[] arr, int n) {
        int limit = 100;
        boolean []seen = new boolean [limit];

        //mark all elements in seen as false to start;

        for(int i =0; i < limit;i++){
            seen[i] = false;
        }

        //find which elment in arr has been in number 0-99
        for(int i=0; i < n;i++){
            if(arr[i]<limit) {
                seen[arr[i]] = true;
            }
        }

        //print out false elements
        int i = 0;

        while(i < limit){
            if(seen[i] ==false){
                //check if there are more missing elements after seen[i]
                int j = i +1;
                while(j< limit && seen[j]==false) {
                    j++;
                }
                    int p = j-1;
                    System.out.println(i+1==j?i:i+"-"+p);
                    i = j;
                }
                //find when seen[j] is true again
                //ex. 0,2,3,
                //ex. 3,10
            else{
                i++;
            }
        }

    }
}
