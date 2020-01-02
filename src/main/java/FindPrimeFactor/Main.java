package FindPrimeFactor;

public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        int tempNum = number;
        int maxPrime = 1;
        if(tempNum <=1){
            return -1;
        }
        for(int i=2; i <= number; i++){
            if(number % i == 0){
                if( i > maxPrime && i!=tempNum && i%2 !=0 || i/2 <= 1){
                    //3*3*5
                    maxPrime = i;
                    number /= i;
                }

            }

        }

        if(maxPrime == 1){
            maxPrime = tempNum;
        }


        return maxPrime;
    }
}
