package cavedweller;

/**
 *
 * @author Oliver Qian
 */
public class Cave {
    // Field
    //excapsulation-when you make everything private
    private int size;
    private Caveman caveman;
    private Bat bat1;
    private Bat bat2;
    private Food food1;
    private Food food2;
    private Key key;
    private Door door;
    //Constructor
    public Cave () {
        this.size = (int) (Math.random()*9)+8;
        this.caveman = new Caveman("Unga", (int)(Math.random() * size), (int)(Math.random() * size));
        this.food1 = new Food("Cheesburger", (int)(Math.random() * size), (int)(Math.random() * size));
        this.food2 = new Food("Pizza", (int)(Math.random() * size), (int)(Math.random() * size));
        this.bat1 = new Bat((int)(Math.random()*size), (int) (Math.random()*size));
        this.bat2 = new Bat((int)(Math.random()*size), (int) (Math.random()*size));
        this.key = new Key ((int)(Math.random()*size), (int) (Math.random()*size));
        this.door = new Door ((int)(Math.random()*size), (int) (Math.random()*size));
        
    }
    //Methods
    public String toString() {
        return "size: "+size;
    }
    public void cavemanVsFood(Food food) {
        if (caveman.getY() == food.getY() && caveman.getX() == food.getX()) {
            caveman.eat(food);
        }
    }
    public void batVsCaveman (Bat bat) {
        if (caveman.getY() == bat.getY() && caveman.getX() == bat.getX()) {
            bat.attack(caveman);
        }
    }
    public void cavemanVsKey (Key key) {
        if (caveman.getX() == key.getX() && caveman.getY() == key.getY()) {
            caveman.pickUp(key);
        }
    }
    public void cavemanVsDoor (Door door) {
        if (caveman.getX() == door.getX() && caveman.getY() == door.getY()){
            caveman.open(door);
        }
    }
    //movement
    public void handleInput(String input){
        if (input.trim().equalsIgnoreCase ("up")) {
            caveman.moveUp();
        }
        else if (input.trim().equalsIgnoreCase ("down")) {
            caveman.moveDown();
        }
        else if (input.trim().equalsIgnoreCase ("left")) {
            caveman.moveLeft();
        }
        else if (input.trim().equalsIgnoreCase ("right")) {
            caveman.moveRight();
        }
        else if (input.trim().equalsIgnoreCase ("close")) {
            System.exit(0);
        }
        else {
            System.out.println("Invalid Command");
        }
        System.out.println(caveman.toString());
        cavemanVsFood(food1);
        cavemanVsFood(food2);
        batVsCaveman(bat1);
        batVsCaveman(bat2);
        cavemanVsKey(key);
        cavemanVsDoor(door);
    }

}
//

