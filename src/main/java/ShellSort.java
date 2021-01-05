import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int [] intArr = {20,35,-15,7,55,1,-22};
        System.out.println(Arrays.toString(shellSort(intArr)));
    }

    private static int[] shellSort(int[] intArr) {
        for(int gap = intArr.length/ 2;gap > 0; gap/= 2 ){
            for (int i = gap; i < intArr.length; i++){
                int newElement = intArr[i];
                int j = i;
                while( j >= gap && intArr[ j- gap] > newElement  ){
                    intArr[j] = intArr[j-gap];
                    j-= gap;
                }
                intArr[j] = newElement;
            }
        }
        return intArr;
    }
}
