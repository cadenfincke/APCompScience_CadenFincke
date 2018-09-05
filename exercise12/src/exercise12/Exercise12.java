/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise12;

/**
 *
 * @author cadenfincke
 */
public class Exercise12 {
    static final int MAX_INDEX = 9;
    public static final String Fibonucci = "Fibonucci Program";
    public static void main(String[] args){
        pointer[] seq;
        seq= new pointer[MAX_INDEX];
        int lo = 1;
        int hi = 1;
        System.out.println(Fibonucci);
        for (int i = 0; i<MAX_INDEX; i++) {
        seq[i]=new pointer();
        seq[i].number=hi;
        seq[i].mark = seq[i].number % 2 == 0;
        hi = lo + hi;
        lo = hi - lo;
        }
        String[] seqStrings = new String[MAX_INDEX];
        for(int i=0;i<MAX_INDEX;i++){
            seqStrings[i]=Integer.toString(i+1)+": "+Integer.toString(seq[i].number);
            if (seq[i].mark)
                seqStrings[i]+="*";
          
        }
        for(int i=0;i<MAX_INDEX;i++)
            System.out.println(seqStrings[i]);
    }
}