public class FibonacciBetterFindSummary {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    static int fib(int num){
        if(num == 0) return 0;
        if(num ==1) return 1;
        int a = 0;
        int b = 1;
        int sum = a+b;
        while(num > 1){
            sum = a+b;
            a = b;
            b= sum;
            num--;
        }
        return sum;
        //1 1 2 3 5
    }
}
