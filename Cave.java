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
public class Cave {
    double temp;
    int size;
    Caveman caveman;
    Bat bat;
    Key key;
    Food food1;
    Door door;
    
    public Cave() {
        this.temp = Math.random() * 100;
        this.size = (int) (Math.random() * 11) + 6;
        this.caveman = new Caveman("Grog",(int)(Math.random() * this.size),(int)(Math.random() * this.size));
    }
    
    public String toString() {
        return ""+size;
    }
    
}
