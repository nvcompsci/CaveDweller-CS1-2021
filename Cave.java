package cavedweller;

/**
 *
 * @author 802189 
 */
public class Cave {
    //encapsulation
    private int size;
    private Caveman caveman;
    private Food food1;
    private Food food2;
    private Bat bat1;
    private Bat bat2; 
    private Door door;
    private Key key;
    
    public Cave() {
        this.size = (int) (Math.random()*9) + 8;
        //instantiate
        this.caveman = new Caveman("Unga", (int) (Math.random() * size), (int) (Math.random() * size));
        this.food1 = new Food("Banana", 3, 10, 10, false);
        this.food2 = new Food("Mushroom", 4, 10, -10, false);
        this.bat1 = new Bat((int) (Math.random() * size), (int) (Math.random() * size));
        this.bat2 = new Bat((int) (Math.random() * size), (int) (Math.random() * size));
        this.door = new Door((int) (Math.random() * size), (int) (Math.random() * size));
        this.key = new Key((int) (Math.random() * size), (int) (Math.random() * size));
    }
   
    public String toString() {
        return "size: "+size;
    }
    
    public void cavemanVsFood(Food food) {
        if (caveman.getX() == food.getX() && 
            caveman.getY() == food.getY()) {
            caveman.eat(food);
        }
    }
    public void cavemanVsKey (Key key) {
        if (caveman.getX() == key.getX() &&
           caveman.getY() == key.getY()) {
                caveman.pickUp(key);
        }
    }
    public void cavemanVsBat (Bat bat) {
        if (caveman.getX() == bat.getX() &&
                caveman.getY() == bat.getY()) {
            bat.bite(caveman);
        }
    }
 
    public void cavemanVsDoor (Door door) {
        if (caveman.getX() == door.getX() &&
                caveman.getY() == door.getY()) {
            caveman.open(door);
        }
    }
    
    public void handleInput(String input) {
        if (input.trim().equalsIgnoreCase("up")) {
            caveman.moveUp();
        }
        else if (input.trim().equalsIgnoreCase("down")) {
            caveman.moveDown();
        }
        else if (input.trim().equalsIgnoreCase("left")) {
            caveman.moveLeft();
        }
        else if (input.trim().equalsIgnoreCase("right")) {
            caveman.moveRight();
        }
        else if (input.trim().equalsIgnoreCase("close")) {
            System.exit(0);
        }
        else {
            System.out.println("Invalid Command");
        }
        
        
        System.out.println(caveman.toString());
        cavemanVsFood(food1);
        cavemanVsFood(food2);
        cavemanVsBat(bat1);
        cavemanVsBat(bat2);
        cavemanVsKey(key);
        cavemanVsDoor(door);
    }
}