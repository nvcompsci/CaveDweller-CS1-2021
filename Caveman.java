package cavedweller;

/**
 *
 * @author Oliver Qian
 */
public class Caveman {
//Fields - instance variables
private String name;
private int x, y, hp;
private boolean hasKey;

//Constructor
public Caveman (String name, int x, int y) {
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

public String toString() {
    return "x: "+x+", y: "+y;
}

public void moveUp() {
    y-= 1;
}
public void moveDown() {
    y+= 1;
}
public void moveRight() {
    x+= 1;
}
public void moveLeft() {
    x-= 1;
}
public void eat(Food food) {
    this.hp += food.getNourishment();
    food.setEaten(true);
    System.out.println("Me eat "+food.getName());
}
public void pickUp(Key key) {
        hasKey = true;
        System.out.println("Me find Key!");
}
public void open(Door door) {
    if (hasKey == true) {
        System.out.println("The Caveman has Escaped!");
        System.out.println("YOU WIN!");
        System.exit(0);
    }
}
//Accessors - getters and setters
public String getName(){
    return name;
}
public int getHp() {
    return hp;
}
public void setHp(int hp) {
    if (hp >= 0 && hp <= 100){
    this.hp=hp;
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
//