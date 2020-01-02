package NumbertoWords;

public class Main {
    public static void main(String[] args) {
       numberToWords(231);
        numberToWords(0);
    }

    public static void numberToWords(int number){
        if(number < 0) {
            System.out.println("Invalid Value");
        }else if (number == 0){
            System.out.println("Zero");
        }else{
            int newNum = reverse(number);
            int digitCount = getDigitCount(number);
            int reverseDigitCount = getDigitCount(newNum);
            int differentDigit=digitCount==reverseDigitCount?0:(digitCount-reverseDigitCount);
            while(newNum > 0){
                int lastDigit = newNum % 10;
                switch(lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;

                }
                newNum /=10;
            }
            if(differentDigit!=0){
                for(int i=0; i<differentDigit;i++){
                    System.out.println("Zero");
                }
            }

        }


    }

    public static int reverse(int num){
        int digitCount = 0;
        boolean isNegative=num<0?true:false;
        if(isNegative){num = num * -1;}
        int reverseNum = 0;
        while (num > 0) {
            reverseNum = reverseNum * 10;
            reverseNum += num%10;
            num /= 10;
        }

        return isNegative?reverseNum*(-1):reverseNum;
    }

    public static int getDigitCount(int number){
        if(number < 0) {return -1;}
        if(number == 0) {return 1;}
        int count = 0;
        while(number > 0){
            int lastDigit = number % 10;
            count ++;
            number /= 10;
        }
        return count;
    }
}
