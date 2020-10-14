/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        GFG gfg = new GFG();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8,9,10 };
        int n = arr.length;
        gfg.subArraySum(arr,n,24);
    }

    int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point 
        for (i = 1; i <= n; i++) {
            // If curr_sum exceeds the sum, 
            // then remove the starting elements 
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, 
            // then return true 
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                return 1;
            }

            // Add this element to curr_sum 
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
    }
}