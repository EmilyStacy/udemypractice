import java.util.Arrays;

public class PythagoreanTriplet {
    private static boolean findTriplet(int[]arr){
        squareAndSort(arr);
        for(int i = arr.length-1; i>=2; i--){
            int max = arr[i];
            int smallest = 0;
            int secondLargest = i-1;
            while(secondLargest > smallest){
                if(arr[smallest]+arr[secondLargest]==max){
                    return true;
                };

                if(arr[smallest]+arr[secondLargest] < max){
                    smallest++;
                }else{
                    secondLargest--;
                }
            }

        }
        return false;
    }

    private static void squareAndSort(int[]arr){
        for (int i=0; i < arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }

        Arrays.sort(arr);

    }
    public static void main(String[] args) {
        //int arr[] = {3,1,4,6,5};
        int arr[]={10,4,6,12,5};

        System.out.println(findTriplet(arr));

    }
}
