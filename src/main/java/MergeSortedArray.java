import java.util.Arrays;

public class MergeSortedArray {
    // in-place merge two sorted arrays X[] and Y[]
    // invariant: X[] and Y[] are sorted at any point
    public static void merge(int[] X, int[] Y)
    {
        int firstL = X.length;
        int secondL = Y.length;

        // consider each element X[i] of array X and ignore the element
        // if it is already in correct order else swap it with next smaller
        // element which happens to be first element of Y
        for (int i = 0; i < firstL; i++)
        {
            // compare current element of X[] with first element of Y[]
            if (X[i] > Y[0])
            {
                // swap (X[i], Y[0])
                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;

                int first = Y[0];

                // move Y[0] to its correct position to maintain sorted
                // order of Y[]. Note: Y[1..n-1] is already sorted
                int k;
                for (k = 1; k < secondL && Y[k] < first; k++) {
                    Y[k - 1] = Y[k];
                }

                Y[k - 1] = first;
            }
        }
    }

    public static void main (String[] args)
    {
        int[] firstArr = { 2, 4, 7, 8, 10,15 };
        int[] secondArr = { 1, 3,6, 9 };

        merge(firstArr, secondArr);

        System.out.println("firstArr: " + Arrays.toString(firstArr));
        System.out.println("secondArr: " + Arrays.toString(secondArr));
    }

}
