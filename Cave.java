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
    //Constructor
    public Cave () {
        this.size = (int) (Math.random()*9)+8;
        this.caveman = new Caveman("Unga", (int)(Math.random() * size), (int)(Math.random() * size));
        this.food1 = new Food("Cheesburger", (int)(Math.random() * size), (int)(Math.random() * size));
        this.food2 = new Food("Pizza", (int)(Math.random() * size), (int)(Math.random() * size));
    }
    //Methods
    public String toString() {
        return "size: "+size;
    }
    //Accessors - getters and setters
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
    }

}


