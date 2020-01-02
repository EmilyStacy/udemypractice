package SumFactors;

public class Main {
    public static void main(String[] args) {
        printOutNumbers();
    }

    public static void printOutNumbers(){
        int isDivided = 0;
        int sumOfI = 0;
        for(int i = 1; i < 1001; i++){
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println(i);
                sumOfI +=i;
                isDivided ++;
                if(isDivided >= 5){
                    break;
                }
            }
        }

        System.out.println(sumOfI);
    }
}
