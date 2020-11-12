public class Sort0s1s2s {
    // Sort the input array, the array is assumed to
    // have values in {0, 1, 2}
    static void sort012(int a[], int arr_size)
    {
        int lowNumIndex = 0;
        int highNumIndex = arr_size - 1;
        int midNumIndex = 0, temp = 0;
        while (midNumIndex <= highNumIndex) {
            switch (a[midNumIndex]) {
                case 0: {
                    temp = a[lowNumIndex];
                    a[lowNumIndex] = a[midNumIndex];
                    a[midNumIndex] = temp;
                    lowNumIndex++;
                    midNumIndex++;
                    break;
                }
                case 1:
                    midNumIndex++;
                    break;
                case 2: {
                    temp = a[midNumIndex];
                    a[midNumIndex] = a[highNumIndex];
                    a[highNumIndex] = temp;
                    highNumIndex--;
                    break;
                }
            }
        }
    }

    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    /*Driver function to check for above functions*/
    public static void main(String[] args)
    {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int arr_size = arr.length;
        sort012(arr, arr_size);
        System.out.println("Array after seggregation ");
        printArray(arr, arr_size);
    }
}
