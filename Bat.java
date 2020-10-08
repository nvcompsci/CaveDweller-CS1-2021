/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedweller;

/**
 *
 * @author Oliver Qian
 */
public class Bat {
    //1.a. Fields - instance variables
    private int x, y, damage;
    private boolean alive;
    //1.b. Constructor
    public Bat (int x, int y) {
        this.x = x;
        this.y = y;
        this.damage = (int) (Math.random()*10)+1;
        this.alive = true;
    }
    //1.c. Methods
    public void attack(Caveman caveman) {
        int newHP = caveman.getHp() - this.damage;
        caveman.setHp(newHP);
        System.out.println("Ouch! A Bat!");
    }
    /**
    * Makes bat randomly move
    */
    public void moveAround() {
        x += (int) (Math.random()*3)-1;
        y += (int) (Math.random()*3)-1;
    }
    //1.d. Accessors
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getDamage() {
        return damage;
    }
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = false;
    }
}
