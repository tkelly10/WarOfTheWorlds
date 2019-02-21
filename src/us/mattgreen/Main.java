package us.mattgreen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    private final static FileInput indata = new FileInput("the_book.csv");
    private final static Map<String, Integer> map = new HashMap<String, Integer>();

    
    
    public static void main(String[] args) {
        new Main();
    }
    
    public Main() {
        String line;
        String[] words;

        while ((line = indata.fileReadLine()) != null) {
            // Remove anything that's not a letter or space
            line = line.replaceAll("[^a-zA-Z ]","")
                    .toLowerCase().trim();
           
            // Don't process lines with no characters
            if (line.isEmpty()) {
                continue;
            }
            
            // Split string over one or more spaces
            words = line.split(" +");
            
            // Look for each word in the map
            for (String word : words) {
                // This word isn't yet a key, init count to 1
                if (!map.containsKey(word)) {
                    map.put(word, 1);
                }
                else {
                    // Increment count using word as key
                    map.put(word, map.get(word) + 1);
                }

            }
            
            
            
         
        }
        Map<String, Integer> checkWords = new HashMap<String, Integer>();
            
            List<Word> lister = new ArrayList<Word>();
            
            for(String some : map.keySet())
            {
                Word a = new Word(some, map.get(some));
                
                lister.add(a);
//                if(!checkWords.containsKey(some))
//                {
//                    checkWords.put(some, 1);
//                }
//                else
//                {
//                    checkWords.put(some, checkWords.get(some) +1);
//                }
//                

                for(Map.Entry<String, Integer> me : checkWords.entrySet())
                {
//                    System.out.println(me.getKey());
//                    System.out.println(me.getValue());
                    
                }
//                System.out.println(checkWords.keySet()+ " "+ checkWords.values());
            }
            Collections.sort(lister);
            System.out.println("The most used words and their count");
            System.out.println("------------------------------------");
        for(int i = 0; i < 10; i++)
        {
            System.out.println( lister.get(i).getWord()+ " " + lister.get(i).getCount() );
        }
        System.out.println("");
        System.out.println("The words that only showed up once ");
        System.out.println("-----------------------------------");
        for(int i = 0; i < lister.size(); i++)
        {
            if(lister.get(i).getCount() == 1)
            {
                System.out.println(lister.get(i).getWord());
            }
        }
    }
    
}