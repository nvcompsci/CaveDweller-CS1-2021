package cavedweller;

/**
 *
 * @author 807665
 */
public class Bat {
   
    Private int x, y, damage;
    private boolean alive;
    //1.b. Constructor
    public Bat(int x, int y) {
        this.x = x;
        this.y = y;
        this.damage = 5;
        this.alive = true;
    }
    //1.c Methods
    public void bite(Caveman caveman){
            int newHP = caveman.getHp() - damage;
            caveman.setHp(newHP);
}
/**
 * Makes bat randomly move
 */ 
  public void moveAround() {
    x+= (int) (Math.random() * 3) - 2;
    y+= ()
}
//1.d. Accessors 
  public int getX() {
      return x;
  }
