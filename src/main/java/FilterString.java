import java.util.HashMap;

public class FilterString {

    public static void main(String[] args) {

    }
    public static String mix(String s1, String s2) {
        // thee //the
        //get the character that appear more than once
        //make two  hashmaps
        //1/2:the number it appears
        
        String result = "";
        HashMap<Character,Integer> s1d = new HashMap<Character, Integer>();
        HashMap<Character,Integer> s2d = new HashMap<Character, Integer>();
        s1d = countString(s1,s2,s1d);
        s2d = countString(s2,s1,s2d);

        return result;
    }

    private static HashMap<Character,Integer> countString(String s1, String s2, HashMap<Character,Integer> map){
        for(int i=0; i< s1.length();i++){
            if (s2.contains(Character.toString(s1.charAt(i)))){
                if(map.containsKey(s1.charAt(i))){
                    map.get(s1.charAt(i) +1 );
                } map.put(s1.charAt(i),0);
            }
        }

        return map;
    }
}
