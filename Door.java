package cavedweller;

/**
 *
 * @author 802967
 */
public class Door {
    private int x, y;
    private boolean open;
    //constructors
   public Door (int x, int y){
    this.x = x;
    this.y = y;
    this.open = false;
}
    //accessors

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    
}
