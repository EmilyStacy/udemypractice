import java.util.Arrays;

public class MinimumPlatformsNeeded {

    public static void main(String[] args) {
        //each platform cannot have two trains
        int [] arr = new int[] {900,940,950,1100,1500,1800};
        int [] dep= new int []{910,1200,1130,1900,2000};
        System.out.println(findPlatforms(arr,dep));

    }

    private static int findPlatforms(int[] arr, int[] dep) {
        if(arr.length <=0 || dep.length <=0) return 0;
        if(arr.length ==1 || dep.length ==1) return 1;
        int maxPlatform = 1;
        int neededPlatform = 1;
        int arrTrainPointer = 1;
        int depTrainPointer = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);

        while(arrTrainPointer < arr.length && depTrainPointer<arr.length ) {
            if (arr[arrTrainPointer] > dep[depTrainPointer]) {
                maxPlatform--;
                depTrainPointer++;
            }else {
                maxPlatform++;
                arrTrainPointer++;
            }


            if (maxPlatform >= neededPlatform) {
                neededPlatform = maxPlatform;
            }
        }
        System.out.println(Arrays.toString(arr) + Arrays.toString(dep));
        return neededPlatform;
    }
}
