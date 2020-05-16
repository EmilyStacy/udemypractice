package Pangram;



public class Main {
    public static void main(String[] args) {
        System.out.println(check("The quickbrown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass"));
        System.out.println(square(-1));
        System.out.println(square(0));
        System.out.println(square(25));
        System.out.println(square(13));

    }


    public static boolean check(String sentence){
        boolean useAllalphabet = sentence.chars().map(Character::toLowerCase).filter(i -> i>= 'a' && i<='z').distinct().count() == 26;
        if(useAllalphabet){
            return true;
        }
        return false;
        }

        public static boolean square(int n){
        if(n >=0){
            int npower = (int) Math.sqrt(n);
            if(Math.pow(npower,2) == n){
                return true;
            }
        }
        return false;
        //return Math.sqrt(n) % 1 == 0;
        }
}
