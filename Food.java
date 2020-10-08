package cavedweller;

/**
 *
 * @author 802189
 */
public class Food {
    //Fields
    private String name;
    private int x, y, hpGiven;
    private boolean eaten;
    //constructor
    public Food(String name, int x, int y, int hpGiven, boolean eaten) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.hpGiven = hpGiven;
        this.eaten = false;
    }
    //methods
    //accessors & setters    
    public String getName() {
        return name;
    }
    
    public int getHpGiven(){
        return hpGiven;
    }
    
   public int getX() {
       return y;
   }
   
   public int getY() {
       return x;
   }
   
   public boolean isEaten() {
       return eaten;
   }
   
   public void setEaten(boolean eaten) {
       this.eaten = eaten;
   }
}
