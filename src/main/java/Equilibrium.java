import java.util.Arrays;

public class Equilibrium {

    public static void main(String[] args) {
        // int[] arr = {1,2,6,4,0,-1};
        // int[] arr = {1};
        // int[] arr = {2,3};
         int[] arr = {1,2,6,4,0,1};
        System.out.println(findEquilibrium(arr));
    }

    private static int findEquilibrium(int[] arr) {
        if(arr.length ==1 )
        {
            System.out.println("Equilibrium is ");
            return arr[0];
        }
        if(arr.length ==2) {
            System.out.println("No Equilibrium");
            return -1;
        }
        int[] summary = new int [arr.length];
        int arrSum = Arrays.stream(arr).sum();
        summary[0] = arr[0];
        int sum = summary[0];
        for(int i=1; i< arr.length;i++){
            summary[i]= sum+arr[i];
            sum+=arr[i];
        }
        System.out.println(Arrays.toString(summary));

        int rightSum;
        int leftSum;
        for(int i=1; i<(arr.length-1);i++){
            leftSum = summary[i] - arr[i];
            rightSum = arrSum - summary[i];
         if (leftSum == rightSum){
             return arr[i];
         }

        }

        System.out.println("No Equilibrium");
        return (-1);
    }
}
