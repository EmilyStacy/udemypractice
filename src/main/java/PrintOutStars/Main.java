package PrintOutStars;

public class Main {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number){
//        if(number < 5) {
//            System.out.println("Invalid value");
//        }
//        for(int row=0; row<number; row++){
//            for(int col=0; col<number;col++){
//                if(row==0 || row==(number - 1)){
//                System.out.print("*");
//                }else {
//                    if(col==0 || col==number-1){
//                        System.out.println("*");
//                    }else{
//                        if(row == col){
//                            System.out.println("*");
//                        }else{
//                            System.out.println(" ");
//                        }
//                    }
//                }
//
//
//
//            }
//            System.out.println();
//        }

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == 0 || i == number - 1) {
                        System.out.print("*");
                    } else {
                        if (j == 0 || j == number - 1) {
                            System.out.print("*");
                        } else {
                            if (i == j) {
                                System.out.print("*");
                            } else {
                                if (j + 1 == number - i) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
   }

}
//5
//(1,1)  (3,1), (2,2),(1,3),(3,3)
//(2,1)(1,2),(3,2),(2,3)
//8
//(1,1),(1,6),(2,2),(2,5),(3,3),(3,4),(4,3),(4,4),(5,5),(5,2),(6,6),(6,1)
//(1,2),(1,3),(1,4)(1,5),(2,1),(2,3)(2,4),(2,6),(2,7),(3,0)...
