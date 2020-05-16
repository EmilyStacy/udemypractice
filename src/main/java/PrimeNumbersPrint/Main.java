package PrimeNumbersPrint;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;


public class Main {

    public static void main(String[] args) {
        System.out.println(factors(99));
        System.out.println(reverseWords("     "));

    }
    public static boolean isPrimeBruteForce(int n) {
        if (n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static String factors(int lst) {
        String result = "";
        for (int fac = 2; fac <= lst; ++fac) {
            int count;
            for (count = 0; lst % fac == 0; ++count) {
                lst /= fac;
            }
            if (count > 0) {
                result += "(" + fac + (count > 1 ? "**" + count : "") + ")";
            }
        }
        return result;
    }


        public static String reverseWords(final String original)
        {
            ArrayList<String> newArr = new ArrayList<String>();
            //smart way:
//            return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
//                    .map(str -> new StringBuilder(str).reverse().toString())
//                    .collect(Collectors.joining());
            //original.replace("  ", "@@");
            if(original.isBlank()){
             return original;
            }
            original.replace(" ", "#");
            String[] arr = original.split(" ");
            System.out.println(Arrays.toString(arr));

            for(String word:arr){
                String reversed = new StringBuilder(word).reverse().toString();

                newArr.add(reversed);
            }

            return newArr.toString().replace(",", "").replace("[","").replace("]","").replace("#"," ");
            //return newArr.toString().replace(",", "").replace("[","").replace("]","");
            //return Arrays.toString(words);
            //How are you ?
            //turn it into a character array
            //find white space
            //substring
        }
    }

//        ArrayList<String> longString = new ArrayList<>();
//        Map<Integer, Integer> primeList = new HashMap();
//        Map<Integer, Integer> result2 = new LinkedHashMap<>();
//        if (n > 1) {
//            getPrimeFactors(n, primeList);
//            primeList.entrySet().stream()
//                    .sorted(Map.Entry.comparingByKey())
//                    .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
//            for (Map.Entry<Integer, Integer> entry : result2.entrySet()) {
//                if (entry.getValue() > 1) {
//                    String factors = "(" + entry.getKey() + "**" + entry.getValue() + ")";
//
//                    longString.add(factors);
//                } else {
//                    String factor = "(" + entry.getKey() + ")";
//                    longString.add(factor);
//                }
//            }
//            System.out.println("Long string is" + longString);
//            StringBuilder builder = new StringBuilder();
//            for (String value : longString) {
//                builder.append(value);
//            }
//
//            String text = builder.toString();
//            return text;
//        }
//
//        return "(1)";
//    }
//
//    private static Map<Integer, Integer> getPrimeFactors(int n, Map<Integer, Integer> primeMap) {
//
//        if(isPrimeBruteForce(n)){
//            int count = primeMap.containsKey(n) ? primeMap.get(n) : 0;
//            primeMap.put(n,count+1);
//            return primeMap;
//        }
//        int i = 2;
//        while(i*i<=n){
//            if(n%i ==0){
//                int count = primeMap.containsKey(i) ? primeMap.get(i) : 0;
//                primeMap.put(i, count + 1);
//                n = n / i;
//                if(isPrimeBruteForce(n)){
//                    count = primeMap.containsKey(n) ? primeMap.get(n) : 0;
//                    primeMap.put(n, count + 1);
//
//                }
//            }
//            else{
//                i++;
//            }
//        }
////        for (int i = 2; i < n; i++) {
////            if (n % i == 0) {
////                if (isPrimeBruteForce(i)) {
////                    for ( Integer key : primeMap.keySet())
////                        if (i % key == 0) {
////                            getPrimeFactors(i, primeMap);
////                        }
////                    int count = primeMap.containsKey(i) ? primeMap.get(i) : 0;
////                    primeMap.put(i, count + 1);
////
////
////
////                } else {
////                    getPrimeFactors(i, primeMap);
////                }
////
////                n = n / i;
////
////            }
////        }
////
////        int count = primeMap.containsKey(n) ? primeMap.get(n) : 0;
////        primeMap.put(n, count + 1);
//
//        return primeMap;
//    }
//}

