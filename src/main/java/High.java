import com.sun.jdi.IntegerValue;

import java.util.*;
import java.util.stream.Collectors;

public class High {
    public static void main(String[] args) {
        System.out.println(high("aaa b abcde"));
        System.out.println(convertAlphabet("abcd"));
    }

    public static String high(String s) {
        // Your code here...
        String result = "";
        int max = 0;
        String[] newText = s.toLowerCase().trim().split("\\W+");
        List<String> list = new ArrayList<String>();
        list = Arrays.asList(newText);
        for(String word:list){
            word = word.replaceAll("[^a-zA-Z0-9]","").trim();

            int stringNum = convertAlphabet(word);
            if(stringNum >max){
                max = stringNum;
                result = word;
            }

        }
        return result;
    }

    public static int convertAlphabet(String word){
        int summary = 0;
        Map<String,Integer> alphabetMap = new HashMap<String, Integer>();
        String [] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int i=0;i<alphabets.length;i++){
            alphabetMap.put(alphabets[i],i+1);
        }
        System.out.println(alphabetMap.entrySet());
        String [] strings = word.split("");
        for(String ch:strings){

            if(alphabetMap.containsKey(ch)) {
                int num = alphabetMap.get(ch);
                summary+=num;
                System.out.println(alphabetMap.get(ch));
            }

        }
        return summary;
    }


}
