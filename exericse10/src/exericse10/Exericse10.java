/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exericse10;

/**
 *
 * @author cadenfincke
 */
public class Exericse10 {
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
        int count = 1;
        for(int i=0;i<MAX_INDEX;i++){
            if (seq[i].mark)
                System.out.printf("%d: %d*%n",i+1,seq[i].number);
            else
                System.out.printf("%d: %d%n",i+1,seq[i].number);
        }
    }
}