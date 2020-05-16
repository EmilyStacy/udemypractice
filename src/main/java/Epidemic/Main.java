package Epidemic;


import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

    }

//    public static int epidemic(int tm, int n, int s0, int i0, double b, double a) {
//        // your code
//        int dt = tm / n;
//        double infectedNum;
//        double infectedNumPlus1
//        //I[k+1] = I[k] + dt(tm/n) * (b * S[k] * I[k] - a * I[k])
//
//    }

public static double findUniq(double arr[]){
//    Double[]arrArray = Arrays.stream(arr)
//            .map(d -> Arrays.stream(d).boxed().toArray(Double[]::new))
//            .toArrayList(Double::parseDouble);
//    ArrayList<Double> arrList = new ArrayList(Arrays.asList(arrArray));
//    Optional<Double> uniqueNum = arrList.stream().distinct().findAny();
//    double num = uniqueNum.orElseThrow(IllegalStateException::new);
//    return num;
    return  Arrays.stream(arr).boxed()
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
            .entrySet().stream().filter(e->e.getValue() == 1).findFirst().get().getKey();
}

}
