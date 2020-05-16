package FindMin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myArr = readInteger(3);
        findMin(myArr);
        reverseArray(myArr);
    }

    private static int[] readInteger(int count){

        System.out.println("Enter " + count + " numbers: \r");
        int[] enteredInt = new int[count];
        for(int i=0; i < count;i++){
            enteredInt[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return enteredInt;
    }

    private static void findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("the minumum amount is " + min);
    }

    private static void reverseArray(int[]arr){
        int maxIndex = arr.length -1;
        int halfLength = arr.length/2;
        for(int i=0; i<halfLength;i++){
            int temp = arr[i];
            arr[i] = arr[maxIndex-i];
             arr[maxIndex-i]=temp;

            //1,2,3,4,5 ; 2
            //i=0; temp = 1; 5,2,3,4,1
            //i=1; temp = 2; 5,4,3,2,1

        }
    }
}
