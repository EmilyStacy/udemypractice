package DigPow;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(digPow(46288,3));
    }

    public static long digPow(int n, int p){
        //collect the digits from n (min to max)
        ArrayList<Integer> digits = new ArrayList<>();
        int tempN = n;
        while(tempN > 0){
            int digit = tempN%10;
            tempN = tempN/10;
            digits.add(digit);
        }

        //increment p based on how many digits n has(from the last item)
        int sumDigits = 0;
        for(int i=(digits.size()-1);i>=0;i--){
            sumDigits+= Math.pow(digits.get(i),p++);
        }

        //divided by n

        //igPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
        //digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k


        System.out.println(sumDigits);
        return sumDigits%n==0?sumDigits/n:-1;
    }



}
