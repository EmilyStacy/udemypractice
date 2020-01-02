package SumFirstandLast;

public class Main {
    public static void main(String[] args) {
//        System.out.println(sumFirstAndLastDigit(10));
//        System.out.println(sumFirstAndLastDigit(5));

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
    }

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int count = 0;
        int temp = number;
        if(number < 0) {
            return -1;
        }
        while(temp > 0) {
            temp /=10;
            count ++;
        }
        if(number > 0 && number < 10){
            sum = number + number;
        }
        if(number > 0 && number >=10){

        for(int i=0; i <= count; i++){
            int lastDigit= number %10;
            number /=10;

           if(i == 0 || i == (count-1)) {
                sum += lastDigit;
            }
        }
        }
        return sum;
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;
        int temp = number;
        int count = 0;
        if(number < 0) {
            return -1;
        }

        if(number > 0) {
            while(temp > 0) {
                int lastDigit = temp % 10;
                count ++;
                temp = temp/10;
            }

            for(int i =1 ; i <=count; i++) {
                int lastDigit = number % 10;
                if(lastDigit % 2 == 0){
                    sum += lastDigit;
                }
                number /=10;
            }

        }
        return sum;
    }
}
