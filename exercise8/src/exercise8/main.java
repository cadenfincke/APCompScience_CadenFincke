/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8;

/**
 *
 * @author cadenfincke
 */
public class main{
    public static void main(String[] args){
        Point tester1 = new Point();
        Point tester2 = new Point();
        tester1.x = 5.0;
        tester1.y = 8.0;
        tester2.x = 27.0;
        tester2.y = 3.0;
        tester1.move(tester2);
        System.out.format("(%f,%f)",tester1.x,tester1.y);
    }
}
