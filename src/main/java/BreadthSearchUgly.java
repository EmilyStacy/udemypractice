import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthSearchUgly {
    public int ladderLength(String beginWord, String endWord, List<String> wordList)
    {
        HashSet<String> set = new HashSet<>();
        for(String word: wordList)
        {
            set.add(word);
        }

        if(!set.contains(endWord)){
            return 0;
        }

        Queue<String>queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;
        while (!queue.isEmpty()){
         //look for a possible change that is one word away for hit from the wordList
            int size = queue.size();
            for(int i=0; i<size; i++){
                //pull out the first word
                String current_word = queue.poll();
                //change the index of word since in Java a string is immutable
                char[]word_char = current_word.toCharArray();
                for(int j=0; j<word_char.length; j++)
                {
                    //h, i, t
                    char original_char = word_char[j];
                    for(char c='a'; c<'z';c++){
                        if(word_char[j] ==c) continue;
                        word_char[j] = c;
                        String new_word = String.valueOf(word_char);
                        if(new_word.equals(endWord)) return level+1;
                        if(set.contains(new_word)) {
                            queue.offer(new_word);
                            set.remove(new_word);
                        }
                    }

                    word_char[j] = original_char;
                }
            }

         //and then go to the next level trying from a to z

           level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        BreadthSearchUgly bs = new BreadthSearchUgly();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("log");
        wordList.add("cog");
        System.out.println(bs.ladderLength(beginWord,endWord,wordList));
    }
}
