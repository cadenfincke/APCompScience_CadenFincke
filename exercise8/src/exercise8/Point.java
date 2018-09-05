/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8;

public class Point{
    public double x, y;
    public void move(Point previous) {
        this.x = previous.x;
        this.y = previous.y;
    }
}