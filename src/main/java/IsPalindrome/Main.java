package IsPalindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(99));
        System.out.println(isPalindrome(9));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int tempNum = num;
        int positiveNum = Math.abs(num);

        if (Math.abs(num) < 10) {
            return false;
        }
        while (positiveNum > 0) {
            reverse = reverse * 10;
            int lastDigit = positiveNum % 10;
            reverse += lastDigit;
            positiveNum /= 10;

        }

        if (Math.abs(tempNum) == reverse) {
            return true;
        }
        return false;
    }
}

