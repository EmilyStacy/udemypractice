package SortArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = getIntegers(5);
       printArray(array);
        printArray(sortArray(array));

    }

    public static int[]getIntegers(int num){
        System.out.println("Enter a number \r");
        Scanner scanner = new Scanner(System.in);
        int[]arr = new int[num];
        for(int i=0; i<num;i++){
            arr[i] = scanner.nextInt();

        }
        return arr;
    }

    public static void printArray(int[] arr ){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortArray(int[] arr){
        int [] newArr = new int[arr.length];
        for(int i=0; i<(arr.length);i++){
            newArr[i] = arr[i];
            //1,2,3,4,5
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<(newArr.length-1); i++){
                if(newArr[i]<newArr[i+1]){
                    temp = newArr[i];
                    newArr[i] = newArr[i+1];
                     newArr[i+1] = temp;
                     flag = true;
                }

            }
        }
        return newArr;
    }

}
