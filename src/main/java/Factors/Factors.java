package Factors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factors {
    static List<Integer> factors = new ArrayList<>();
    public static void main(String[] args) {
        findFactors(86240);
        printFactors();
    }

    public static void printFactors() {
        Map<Integer, Integer> factorMap = new HashMap<>();
        for(Integer f : factors) {
            factorMap.put(f, (int) factors.stream().filter(t -> t.equals(f)).count());
        }
        for(Integer k : factorMap.keySet()) {
            if(factorMap.get(k) == 1)
                System.out.printf("(%s)", k);
            else
                System.out.printf("(%s**%s)", k, factorMap.get(k));
        }
    }

    public static void findFactors(int n) {

        if(isPrime(n)) {
            factors.add(1);
            factors.add(n);
            return;
        }
        int i = 2;
        while(i*i <= n) {

            if( n % i == 0) {
                factors.add(i);
                n = n/i;
                if(isPrime(n)) {
                    factors.add(n);
                }
            } else {
                i++;
            }

        }

    }

    //checks whether an int is prime or not.
    static boolean isPrime(int n) {
        if (n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
