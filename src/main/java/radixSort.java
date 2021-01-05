import java.util.Arrays;

public class radixSort {
    public static void main(String[] args) {
        int [] radixArray = {4725, 4586,1330,8792, 1594, 5729};
       radixSort(radixArray,10,4);
    }

    public static void radixSort(int[]input, int radix, int width){
       /*width is how many places a num have; radix is how many digits a number can include; in this case
        with numbers the radix is 0-9 = 10
        */
        for(int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int [radix];

       //works as a basket and return the digit
       //it will help while putting nums into the temp array
        for(int value: input){
            countArray[getDigit(position, value,radix)]++;
            System.out.println("countArray is " + Arrays.toString(countArray));
            //make sure it is stable, so add up the digits that have happened
        }

        for(int j = 1; j < radix; j++ ){
            countArray[j]+= countArray[j-1];
            System.out.println("countArray 2 is " + Arrays.toString(countArray));
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems -1; tempIndex >=0; tempIndex --){
            //put the value into the tempArray
            temp[--countArray[getDigit(position,input[tempIndex],radix)]] = input[tempIndex];
            //copy the tempArray back

        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }

        System.out.println(Arrays.toString(input));
    }

    private static int getDigit(int position, int value, int radix) {
        return  value / (int)Math.pow(radix,position) % radix;

    }
}
