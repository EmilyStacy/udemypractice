package WhileLoop;

public class main {
    public static void main(String[] args) {
        System.out.println( sumDigit(128));
        System.out.println( sumDigit(-1));
        System.out.println( sumDigit(125));
        System.out.println( sumDigit(4));
        System.out.println( sumDigit(45678));

    }

    private static int sumDigit(int num){
        if(num < 10){
            return -1;
        }
        int sum = 0;

        while(num > 0){
            sum += num%10;
            num  /= 10;

        }
        return sum;
    }

}
