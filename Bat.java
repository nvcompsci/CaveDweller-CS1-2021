
package cavedwellerkrishna;

/**
 *
 * @author Krishna Saraiya
 */
public class Bat {
    //1.a. feilds - instance variable
    private int x, y, damage;
    private boolean alive;
    //1.b. Constructor
    public Bat (int x, int y) {
        this.x = x;
        this.y = y; 
        this.damage = 5;
        this.alive = true;
    }
    //1.c. Methods
     public void bite(Caveman caveman) {
         int newHP = caveman.getHp() - damage;
         caveman.setHp(newHP);
    }
    /**
     * Makes bat randomly move 
     **/
    public void moveAround() {
        x += (int) (Math.random() * 5) - 2;
        y += (int) (Math.random() * 5) - 2; 
    } 
    //1.d. Accessors
    public void isAlive(boolean alive) { 
        this.alive = alive;
    } 
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
        
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
}
