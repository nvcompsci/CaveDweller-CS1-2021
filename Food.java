package cavedweller;

/**
 *
 * @author Oliver Qian
 */
public class Food {
    //Fields
    private String name;
    private int x, y, nourishment;
    private boolean eaten;
    //Constructor
    public Food (String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.nourishment = (int) (Math.random()*11)+5;
        this.eaten = false;
    }
    //Methods
    
    //Accessors - getters and setters
    public String getName() {
        return name;
    }
    public int getX(){
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
    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }
}
