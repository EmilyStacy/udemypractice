package DNAComplementary;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeComplement("GTAT"));
        System.out.println(findNextSquare(121));
    }

    public static String makeComplement(String dna) {
        //Your code
        char[]dnaArray = dna.toCharArray();
        char[]newDnaArray = new char[dna.length()];
        for(int i=0;i< dnaArray.length;i++){
            if(dnaArray[i]=='A'){
                newDnaArray[i] = 'T';
            }

            if(dnaArray[i]=='T'){
                newDnaArray[i] = 'A';
            }

            if(dnaArray[i]=='C'){
                newDnaArray[i] = 'G';
            }

            if(dnaArray[i]=='G'){
                newDnaArray[i] = 'C';
            }


        }
        String newDna = new String(newDnaArray);
        return newDna;
    }
    //clever solution 1:
//    public class DnaStrand {
////        private static HashMap<Character, Character> map = new HashMap<>(4);
////        static {map.put('A', 'T'); map.put('T', 'A'); map.put('C', 'G'); map.put('G', 'C');}
////        public static String makeComplement(String dna) {
////            return dna.chars().mapToObj(c -> String.valueOf(map.get((char)c))).collect(Collectors.joining());
////        }

    //best practice solution 2:

//    public static String makeComplement(String dna) {
//        char[] chars = dna.toCharArray();
//        for(int i = 0; i < chars.length; i++) {
//            chars[i] = getComplement(chars[i]);
//        }
//
//        return new String(chars);
//    }
//
//    private static char getComplement(char c) {
//        switch(c) {
//            case 'A': return 'T';
//            case 'T': return 'A';
//            case 'C': return 'G';
//            case 'G': return 'C';
//        }
//        return c;
//    }

    public static long findNextSquare(long sq) {

        return Math.sqrt(sq)%1==0?(long)(Math.sqrt(sq)+1)*(long)(Math.sqrt(sq)+1):-1;


    }
}
