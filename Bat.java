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
public class Bat {
    //Fields - Instance variables
    private boolean alive;
    private int x, y, damage;
    
    //1. Constructor
    public Bat(int x, int y) {
        this.alive = true;
        this.x = x;
        this.y = y;
        this.damage = 5;
    }
    
    //Methods
    public void moveAround() {
        //2.a. increase/decrease x by random number
        x += (int) (Math.random()*5) - 2;
        //2.b. increase/decrease y by random number
        y += (int) (Math.random()*5) - 2;
    }
    
    public void bite(Caveman caveman) {
        //3. reduce the hp of the caveman
        int newHP = caveman.getHP() - damage;
        caveman.setHP(newHP);
        //caveman.setHP(caveman.getHP() - damage);
    }
    //4. Accessors

    public boolean isAlive() {
        return alive;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDamage() {
        return damage;
    }
    
}
