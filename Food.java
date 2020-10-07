/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedweller;

/**
 *
 * @author 807665
 */
public class Food {
    //Fields - instance variables
private String name;
private int x, y, hp;
private boolean eaten;
    //Constructor
    public Food (String name, int x, int y ) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.eaten = true;
    }
        //Methods
    
    //Accessors - getters and setters    //Accessors - getters and setters  
C:\Users\807665.SYLVANIA\Documents\NetBeansProjects\CaveDweller\src\cavedweller\Food.java  

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHp() {
        return hp;
    }

    public boolean isEaten() {
        return eaten;
    }
    
}
