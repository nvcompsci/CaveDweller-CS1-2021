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
    private String food;
    private int x, y, nourishment;
    private boolean eaten;
    // Constructor
     public Food (String food, int x,int y) {
     this.food = food;
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
     //Accessors - getters and setters
     public String eaten() {
         return food;
     }
     public int getEffect() {
         return nourishment;
     }
     
     
}
