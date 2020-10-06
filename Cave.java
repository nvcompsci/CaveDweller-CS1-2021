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
        //6. Instantiate food2, bat1, bat2, door, key
        this.food2 = 
        this.bat1 = new Bat((int)(Math.random() * this.size),(int)(Math.random() * this.size));
        this.bat2 = 
        this.door = 
        this.key =        
        //EX. Improve placement of door above to only place on walls
        
    }
    
    private void checkCollisions() {
        if (caveman.getX() == food1.getX() && caveman.getY() == food1.getY()) {
            caveman.eat(food1);
        }
        //7. Write more if statements to handle collision between caveman and other objects
        //7.a change the code below for food1
        if (caveman.getX() == food2.getX() && caveman.getY() == food2.getY()) {
            caveman.eat(food2);
        }
        if (caveman.getX() == bat1.getX() && caveman.getY() == bat1.getY()) {
            bat1.bite(caveman);
        }
        if (caveman.getX() == bat2.getX() && caveman.getY() == bat2.getY()) {
            bat2.bite(caveman);
        }
        if (caveman.getX() == key.getX() && caveman.getY() == key.getY()) {
            caveman.pickUpKey();
        }
        if (caveman.getX() == door.getX() && caveman.getY() == door.getY()) {
            caveman.openDoor();
        }
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
        makeBatsMove();
        checkCollisions();
        System.out.println(caveman.toString());
    }
    
    //8. Implement method MakeBatsMove
    private void makeBatsMove() {
        bat1.moveAround();
        bat2.moveAround();
    }
    
    public String toString() {
        return ""+size;
    }
    
}
