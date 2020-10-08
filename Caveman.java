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
public class Caveman {
   //Fields - instance variables
    String name;
    int x, y, hp;
   boolean hasKey;
    //Constructor
    public Caveman(String name, int x, int y ) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.hasKey = false;
    }
        //Methods
    public void speak() {
       System.out.println("ugh");
    }     
    
    public void eat(Food food) {
        this.hp += food.getNourishment();
        food.setEaten(true);
    }
    public void pickUp(Key key) {
        hasKey = true;
        System.out.println("You found the key");
        
    }
    
    public void open(Door door)
          if (haskey == true)  
         System.out.println("The caveman escaped!");
         System.exit(0);
   }
    
    public String toString() {
    
    }
    public void moveUp() {
        y += 1;
    }
     public void moveDown() {
        y -= 1;
    } 
     public void moveRight() {
        x += 1;
    }
     public void moveLeft() {
        x -= 1;
    }
    //Accessors - getters and setters 
    public String getName () {
        return name;
    }
    
    public int getHp () {
return hp; 
}
    
public void setHp(int hp) {
    if (hp >= 0 && hp <= 100) {
        this.hp = hp;
    }
}
 

}