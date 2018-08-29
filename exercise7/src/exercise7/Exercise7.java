/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

public class Exercise7 {
    static final int MAX_INDEX = 9;
    public static void main(String[] args) {
        int lo = 1;
        int hi = 1;
        String mark;
        System.out.println("10: " + lo);
        for (int i = MAX_INDEX; i > 0; i--) {
            if (hi % 2 == 0)
                mark = " *";
            else
                mark = "";
            System.out.println(i + ": " + hi + mark);
            hi = lo + hi;
            lo = hi - lo;
        }
    }
}