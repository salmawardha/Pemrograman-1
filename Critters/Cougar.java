import java.awt.*;  // for Color

public class Cougar extends Critter {
    private boolean ateFoodAlready;
    
    public Cougar() {
        ateFoodAlready = false;   // initially, he has not eaten
    }
    
    public boolean eat() {
        // toggle the boolean flag so that he will change direction
        ateFoodAlready = !ateFoodAlready;
        return true;
    }
    
    public Color getColor() {
        return Color.BLUE;      // unfinished
    }
    
    public Direction getMove() {
        if (!ateFoodAlready) {
            // go west if he has not eaten (or eaten 2x, 4x, etc.)
            return Direction.WEST;
        } else {
            // go east if he has eaten once (or 3x, 5x, etc.)
            return Direction.EAST;
        }
    }
    
    public String toString() {
        return "C";
    }
}