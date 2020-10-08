/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedwellerkrishna;

/**
 *
 * @author Krishna Saraiya
 */
public class Cave {
    //encapsulation
    private int size;
    private Caveman caveman;
    private Food food1;
    private Food food2;
    private Bat bat1;
    private Bat bat2;
    private Door door;
    private Key key;
    
    public Cave() {
        this.size = (int)(Math.random()*9) + 8;
        //instantiate
        this.caveman = new Caveman("Unga", (int)(Math.random()* size), (int)(Math.random() * size));
        this.food1 = new Food("Apple", (int)(Math.random()* size), (int)(Math.random() * size));    
    //Instantiate bat 1,bat 2
        this.bat1 = new Bat((int)(Math.random()* size), (int)(Math.random() * size));
        this.bat2 = new Bat((int)(Math.random()* size), (int)(Math.random() * size));
    //Instantiate door and key
        this.door = new Door ((int)(Math.random()* size), (int)(Math.random() * size));
        this.key = new Key ((int)(Math.random()* size), (int)(Math.random() * size));
    }
    public String toString() {
        return "size: "+size;
}
    
    public void cavemanVsFood(Food food) {
        if (caveman.getY() == food.getY() && 
            caveman.getX() == food.getX()) { 
            caveman.eat(food);
        }
    }
    public void cavemanVsDoor(Door door) {
        if (caveman.getY() == door.getY() && 
            caveman.getX() == door.getX()) { 
            caveman.open(door);
        }
    } 
    public void cavemanVsKey(Key key) {
        if (caveman.getY() == key.getY() && 
            caveman.getX() == key.getX()) { 
            caveman.pickUp(key);
        }
    }
    public void cavemanVsBat1(Bat bat1) {
        if (caveman.getY() == bat1.getY() && 
            caveman.getX() == bat1.getX()) { 
            caveman.bite(bat1);
        }
    }
    public void cavemanVsBat2(Bat bat2) {
        if (caveman.getY() == bat2.getY() && 
            caveman.getX() == bat2.getX()) { 
            caveman.bite(bat2); 
        }
    }
    public void handleInput(String input) {
        if(input.trim().equalsIgnoreCase("up")) {
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
            System.out.println("(invalid command}");
        }
        
        System.out.println(caveman.toString());
        cavemanVsFood(food1);
        cavemanVsBat1(bat1);
        cavemanVsBat2(bat2);
        cavemanVsDoor(door);
        cavemanVsKey(key);
        
    }
}
