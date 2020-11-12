import java.util.Arrays;

public class RearrangeArrayAlternatively {

    public static void main(String[] args) {
       //int[]original = {1,2,3,4,5,6};
        int[]original = {1,2,3,4,5,};
        System.out.println(Arrays.toString(helper(original)));
    }

    private static int[] helper(int[] original) {
        //the index that needs to be bigger than both max and min; %z for min and /z for max
        int z = 10;
        int max_index = original.length-1;
        int min_index = 0;

        for(int i = 0; i < original.length;i++){

            if(i%2 ==0){
                original[i] += (original[max_index] % z)*z;
                max_index--;//i = 0, max=4//i=2, max=3// i = 4, max = 2(not used)
            }
            else
            {
                original[i]+= (original[min_index]%z)*z;
                min_index++; //i =1, min=1;i=3, min=2;i = 5, min = 3
            }
        }

        for(int i =0; i <original.length;i++){
            original[i]/=z;
        }
        return original;
    }
}
