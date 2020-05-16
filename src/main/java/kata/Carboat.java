package kata;

import java.util.ArrayList;
import java.util.Arrays;

public class Carboat {

    public static void main(String[] args) {
        //System.out.println(howmuch(2950,2950));
       //System.out.println(howmuch(1,100));
        //System.out.println(howmuch(1000,1100));
        System.out.println(howmuch(0,200));
        //System.out.println(howmuch(10000,9950));
    }
    public static String howmuch(int m, int n) {
        ArrayList<String[]> sumList = new ArrayList<>();
        if(n >=m && m >=0 || m >=n && n >=0){
            if(m >=n ){
               int temp = n;
               n = m;
               m = temp;
            }
            for (int i=m; i <=n; i++){
            int carMax = i -1;
            int boatMax = i-2;
            if (carMax > 0 && boatMax > 0 && carMax %9 ==0 && boatMax %7==0){
                int carAmount = carMax/9;
                int boatAmount = boatMax/7;

                String money = "M: "+ i + " B: " + boatAmount + " C: " + carAmount;
                String[]strArr = new String[]{money};
                sumList.add(strArr);
            }
        }



    }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(String[] value: sumList){
            builder.append(Arrays.toString(value));
        }
        builder.append("]");
        String text = builder.toString();
        return text;

    }
//    public static String howmuch(int m, int n) {
//        StringBuilder result = new StringBuilder("[");
//
//        for (int x=Math.min(m,n); x<=Math.max(m,n); x++)
//            if ((x-1)%9 == 0 && (x-2)%7 == 0)
//                result.append(String.format("[M: %d B: %d C: %d]",x,((x-2)/7),((x-1)/9)));
//
//        return result.append("]").toString();
//    }

//    public static String howmuch(int m, int n) {
//        return "[" + IntStream.rangeClosed(Math.min(m, n), Math.max(m, n))
//                .filter(x -> x % 9 == 1 && x % 7 == 2)
//                .mapToObj(x -> String.format("[M: %d B: %d C: %d]", x, x / 7, x / 9))
//                .collect(Collectors.joining())
//                .toString() + "]";
//    }
//}
}
