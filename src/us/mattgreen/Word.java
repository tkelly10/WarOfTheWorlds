/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.mattgreen;

/**
 *
 * @author tyler
 */

public class Word implements Comparable <Word> {

 
  
    private String word;
    
    private int count;
    
     public Word(String word, int count)
    {
      this.word = word;
      this.count = count;
    }

    public String getWord() {
        return word;
    }
     
   public int getCount() {
        return count;
    }
    
    @Override
    public int compareTo(Word o) {
        if(this.count < o.count)
        {
            return 1;
        }
        else if (this.count > o.count)
        {
            return -1;
        }
        return 0;
}
}