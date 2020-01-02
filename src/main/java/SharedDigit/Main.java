package SharedDigit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println(hasSharedDigit(9,9));
//        System.out.println(hasSharedDigit(12,23));
//        System.out.println(getGreatestCommonDivisor(15,25));
//        System.out.println(getGreatestCommonDivisor(19,23));
        System.out.println(isPerfectNumber(6));
    }

    public static boolean hasSharedDigit(int x, int y) {
        int xdigits[] = new int [2];
        int ydigits[] = new int[2];
        if(x < 10 || x > 99 || y < 10 || y > 99 ){
            return false;
        }

        while(x > 0) {
            for(int i = 0; i < 2; i++){
                xdigits[i] = x%10;
                x /= 10;
                ydigits[i] = y%10;
                y /=10;
            }
        }

        for(int xdigit: xdigits){
            for(int ydigit:ydigits){
                if (xdigit == ydigit){
                    return true;
                }
            }
        }
        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int gcd = 1;
        if(first < 10 || second < 10) {
            return -1;
        }else{
           //test if first is a prime number
            for(int i= 2; i<first; i++) {
                if(first%i ==0){
                    break;
                }
            }
           //test if second a prime number
            for(int i= 2; i<second; i++) {
                if(second%i ==0){
                    break;
                }
            }
           //find the greatest common factor
            for(int i =1; i<= first && i <= second; i++){
                if(first%i ==0 && second % i ==0) {
                    gcd = i;
                }
            }

        }

    return gcd;
    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int temp = number;

        int sum = 0;
        for(int i=1; i < temp; i++) {
            if(temp % i == 0 ) {
                sum += i;
                //number /= i;
            }
        }

        if(temp == sum) {
            return true;
        }
        return false;
    }
}
