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
    private double temp;
    private int size;
    private Caveman caveman;
    private Bat bat1;
    private Bat bat2;
    private Key key;
    private Food food1;
    private Food food2;
    private Door door;
    
    public Cave() {
        this.temp = Math.random() * 100;
        this.size = (int) (Math.random() * 2) + 4;
        //instantiate
        this.caveman = new Caveman("Grog",(int)(Math.random() * this.size),(int)(Math.random() * this.size));
        this.food1 = new Food("banana",(int)(Math.random() * this.size),(int)(Math.random() * this.size));
        //6. Instantiate food2, bat1, bat2, door
        
        //9. Improve placement of door above to only place on walls
        
    }
    
    private void checkCollisions() {
        if (caveman.getX() == food1.getX() && caveman.getY() == food1.getY()) {
            caveman.eat(food1);
        }
        //7. Write more if statements to handle collision between caveman and other objects
        
    }
    
    public void handleInput(String input) {
        if (input.trim().equalsIgnoreCase("up")) {
            caveman.moveUp();
        }
        else if (input.trim().equalsIgnoreCase("down")) {
            caveman.moveDown();
        }
        else if (input.trim().equalsIgnoreCase("left")) {
            caveman.moveLeft();
        }
        else if (input.trim().equalsIgnoreCase("right")) {
            caveman.moveRight();
        }
        else if (input.trim().equalsIgnoreCase("close")) {
            System.exit(0);
        }
        else {
            System.out.println("(command not valid)");
        }
        checkCollisions();
        System.out.println(caveman.toString());
    }
    
    //8. Implement method MakeBatsMove
    private void makeBatsMove() {
        
    }
    
    public String toString() {
        return ""+size;
    }
    
}
