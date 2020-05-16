public class factorial {
    public static void main(String[] args) {
        //System.out.println(factorial(0));
        System.out.println(presses("1"));
    }

    public static int factorial(int n) {
        int result = 1;
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        } else {
            while (n > 0) {
                result= n*result;
                n--;
            }

            return result;
            //2*1
            // Happy coding :-)
        }
//    Write a function to calculate factorial for a given input.
//        public int factorial(int n) {
//            if(n < 0 || n > 12) throw new IllegalArgumentException("Useless fuffery!");
//            return n <= 1 ? 1 : n * factorial(n - 1);
//        }

    }

    public static int presses(String phrase) {
//        static String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
//
//        public static int presses(String phrase) {
//            int nPresses = 0;
//
//            for (char c : phrase.toUpperCase().toCharArray())
//                for (String s : keys)
//                    nPresses += s.indexOf(c) + 1;
//            return nPresses;
//        }
        int count = 0;
        String upperP = phrase.toUpperCase();
        char[] phraseArr = new char[upperP.length()];
        for(int i=0;i<upperP.length();i++){
            phraseArr[i] = upperP.charAt(i);
        }
        for(char c:phraseArr){
            System.out.println(c);
          if(c == '1' || c== ' ' || c=='*' || c=='#' || (c!= ' '&& c!='S' && c!='V' && c!='Y' && (int)c % 3 ==2 )){
                count ++;
            }

            else if(c == 0 || (c!= ' ' && c!='T' && c!='W' && c!='Z' && (int)c % 3 ==0 )){
                count +=2;
            }

            else if((c!= ' ' && c!='U'&& c!='X' &&(int)c % 3 == 1)){
                count +=3;
            }
            else if(c >= '2' && c <= '9' ){
                count +=4;
            }
            switch(c){
                case 'S':count +=4;
                        break;
                case 'T': count++;
                        break;
                case 'U':count+=2;
                        break;
                case 'V': count+=3;
                        break;
                case 'W':count ++;
                    break;
                case 'X': count+=2;
                    break;
                case 'Y':count+=3;
                    break;
                case 'Z': count+=4;
                    break;

                default: count+=0;
                    break;
            }
        }
        //use if to add the counts
        //numbers: 4 times except 1(one time) and 0(2 times)
        //white space:1
        //*:one time
        //#: one time
        //s:83 but being pressed 4 times(%3==2)  t84(0)u85(1)v86(2)   w87(0)x88(1)y89(2)z90(3)
        return count;
    }
}
