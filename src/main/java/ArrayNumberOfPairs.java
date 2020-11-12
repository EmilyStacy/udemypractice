import java.util.Arrays;

//print out x^y > y^x
public class ArrayNumberOfPairs {
    public static void main(String[] args) {
        int x[] = {0,3,2,1,6,7};
        int y[] = {0,1,4,5,8};
        System.out.println("Total pairs" + countPairs(x,y,x.length,y.length));
    }

    private static int countPairs(int[] x, int[] y, int xLength, int yLength) {
        //store counts of 0,1,2,3,4, which are exceptions
        int NoOfY[] = new int [5];
        System.out.println("before sorting the NoOfY is " + Arrays.toString(NoOfY));
        for(int i = 0; i < yLength;i++) {
            if (y[i] < 5) {
                NoOfY[y[i]]++;
            }
        }
            //get ready for binary search
            Arrays.sort(y);

        int total_pairs = 0;
            for(int i = 0; i < xLength;i++){
                total_pairs += count(x[i],y, yLength, NoOfY);
            }
        return total_pairs;
    }

    private static int count(int x, int[] y, int yLength, int[] NoOfY) {
        if(x == 0) return 0;
        // If x is 1, then the number of pais is equal to number of
        // zeroes in Y[]
        if (x == 1) return NoOfY[0];
        // Find number of elements in Y[] with values greater than x

        // getting upperbound of x with binary search
        int idx = Arrays.binarySearch(y, x);
        int resultCount;
        //all ys smaller than x
        //binary search: if found, returning index starting from 0; if not found, returning the index bigger than the target+1
        if(idx < 0){
                idx = Math.abs(idx+1);
                resultCount = yLength-idx;
        }else{
            while(idx < yLength && y[idx]==x){
                idx++;
            }
            resultCount = yLength -idx;
        }

        resultCount += (NoOfY[0] + NoOfY[1]);
        System.out.println("resultCount is" + resultCount);
        if (x == 2)  resultCount -= (NoOfY[3] + NoOfY[4]);
        System.out.println("during sorting the NoOfY is " + Arrays.toString(NoOfY));
        if (x == 3)  resultCount += NoOfY[2];
        System.out.println("after sorting the NoOfY is " + Arrays.toString(NoOfY));
        return resultCount;
    }
}
