/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedweller;

/**
 *
 * @author jword
 */
public class Caveman {
    //Fields / Instance variables
    String name;
    int hp, x, y;
    boolean hasKey;
    
    //Constructor
    public Caveman(String name, int x, int y) {
        this.hp = 100;
        this.hasKey = false;
        this.name = name;
        this.x = x;
        this.y = y;
    }
    //Methods
    public void speak() {
        System.out.println("Grr");
    }
    
    public String toString() {
        return "x: "+x+", y: "+y;
    }
    
    //Accessors - getters & setters
    
}
