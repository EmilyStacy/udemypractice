package ScannerInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int count = 1;

        double average = 0;

        while (count < 8) {
            System.out.println("Enter number # " + count);
            boolean isInt = scanner.hasNextInt();
            if (count ==1 && !isInt) {
                System.out.println("SUM = 0 AVG = 0");
                return;
            } else {
                if (isInt) {
                    var inputInt = scanner.nextInt();
                    sum += inputInt;
                    count++;
                    scanner.nextLine();
                }
                if(!isInt){
                   break;
                }

            }

        }
        average = ((double)sum)/(count-1);
        int newaverage = (int)Math.round(average);
        System.out.println("SUM = "+sum +" AVG = "+newaverage);
        scanner.close();
}
}
