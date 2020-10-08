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
public class Cave {
    //encap
  private int size;	   
    private Caveman caveman;
    private Food food1;	    
    private Food food2;
  private Bat bat1;
  private Bat bat2;
    public Cave(){
        this.size = (int) (Math.random ()*9)+8;
        this.caveman = new Caveman("Unga",(int)(Math.random()* size),(int)(Math.random()));
    this.food1 = new Food("banana",(int)(Math.random()*size),(int)(Math.random()* size));
    //2. Instantiate bat1 bat2
    this.bat1 = new Bat((int) (Math.random()*size ),(int)(Math,random())); 
    this.bat2 =
    
    }


    
    public String toString() {
        return "size";
    }
    
    public void cavemanVsFood(Food food) {
        if (caveman.getY() == food.getY() &&
            caveman.getX() == food.getX ()) {
            caveman.eat(food);
        }
     }

public void handleInput(String input) {
  if (input.equals("up")) {
    caveman.moveUp();
   }
   else if (input.equals("Down")) {
    caveman.moveDown();

  }
   else if (input.equals("Left")) {
    caveman.moveLeft();

 }
   else if (input.equals("right")) {
    caveman.moveRight();

   }
 
   else if (input.equals("close")) {
    System.exit(0);

   }
   else { 
    System.out.println("(invalid command)");
}
System.out.println(caveman.toString());
}
}