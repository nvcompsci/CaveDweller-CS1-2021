package cavedweller;

/**
 *
 * @author John Word
 */
public class Cave {
    //encapsulation
    private int size;
    private Caveman caveman;
    private Food food1;
    private Food food2;
    
    public Cave() {
        this.size = (int)(Math.random()*9) + 8;
        //instantiate
        this.caveman = new Caveman("Unga",(int)(Math.random() * size), (int) (Math.random() * size));
        this.food1 = new Food("banana",(int)(Math.random() * size), (int) (Math.random() * size));
    }
    
    public String toString() {
        return "size: "+size;
    }
    
    public void cavemanVsFood(Food food) {
        if (caveman.getY() == food.getY() &&
            caveman.getX() == food.getX()) {
            caveman.eat(food);
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
            System.out.println("(invalid command)");
        }
        
        System.out.println(caveman.toString());
        cavemanVsFood(food1);
    }
}


