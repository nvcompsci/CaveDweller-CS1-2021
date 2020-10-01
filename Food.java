/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedwellerkrishna;

/**
 *
 * @author 718618
 */
public class Food {
    //Fields
    private String name;
    private int x, y, nourishment;
    private boolean eaten;
    // Constructor
     public Food (String food, int x,int y) {
     this.name = food;
     this.x = x;
     this.y = y;
     this.nourishment = 100;
     this.eaten = false;
     }   
      //Methods
     public void food() {
         System.out.println("Me Get food");
     }
     public String toString() {
         return "x: "+x+", y: "+y;
     }
     public void position() {
         y = 0;
     }

    public String getFood() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getNourishment() {
        return nourishment;
    }

    public boolean isEaten() {
        return eaten;
    }
     //Accessors - getters and setters
    public String getName() {
        return name;
        
    }
     public String eaten() {
         return name;
     }
     public int getEffect() {
         return nourishment;
     }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }

    
     
     
}
