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
public class Food {
    //Fields
    private String name;
    private int x, y, hpChange;
    private boolean eaten;
    //Constructor
    
    //Methods
    public String toString() {
        return "";
    }
    //Accessors

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHPChange() {
        return hpChange;
    }

    public boolean isEaten() {
        return eaten;
    }
    
}
