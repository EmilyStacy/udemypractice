package OddInt;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int [] testArray = {1,2,3,3,3,4,5};
        System.out.println(findIt(testArray));

    }

    private static int findIt(int[] arr){
        //Given an array, find the integer that appears an odd number of times.
        HashMap<Integer,Integer> arrMap = new HashMap<>();
        int odd = 0;
        for(int i =0;i<arr.length;i++){
            int count = arrMap.containsKey(arr[i]) ? arrMap.get(arr[i]) : 0;
            arrMap.put(arr[i],count+1);
            int oddKey = arrMap.get(arr[i]);
            odd=oddKey%2!=0&&oddKey>1?oddKey:1;
        }
        int finalOdd = odd;
        return arrMap.entrySet().stream().filter(entry-> entry.getValue().equals(finalOdd)).map(Map.Entry::getKey).findFirst().orElseThrow(null);
    }
}
