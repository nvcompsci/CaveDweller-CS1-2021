package cavedweller;

/**
 *
 * @author 802189
 */
public class Caveman {
    //Fields - instance variables
    private String name; 
    private int x, y, hp;
    private boolean hasKey;
    
    //Constructors
    public Caveman(String name, int x, int y) { 
        this.name = name;
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.hasKey = false;
    }
    //Methods 
    public void speak() {
        System.out.println("Ugh");
    }
    public void eat(Food comida) {
        this.hp += comida.getHpGiven();
        comida.setEaten(true);
        System.out.println("Me eat"+comida.getName());
    }
    
    public void pickUp(Key key) {
        hasKey = true;
        System.out.println("Key Received");
    }
    
    public void open(Door door) {
        if (hasKey == true) {
            System.out.println("The caveman has escaped.");
            System.exit(0);
        }
    }
    
    public String toString() {
        return "x: "+x+", y: "+y;
    }
    
    public void moveUp() {
        y = y - 1;
    }
    public void moveDown() {
        y = y + 1;
    } 
    public void moveLeft() {
        x -= 1;
    } 
    public void moveRight() {
        x += 1;
    }
    //Accessors - getters and setters
    public String getName() {
        return name;
    }
    
    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        if (hp >= 0 && hp <= 100) {
        this.hp = hp;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isHasKey() {
        return hasKey;
    }
    
    
}
