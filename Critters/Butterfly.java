import java.awt.*;

public class Butterfly extends Critter {
    private int moves;
    
    public Butterfly() {
       
    }
    
    public Color getColor() {
        return Color.YELLOW;
    }

    public boolean eat() {
        return super.eat();
    }

    public Attack fight(String opponent) {
        return Attack.FORFEIT;
    }

    public Direction getMove() {
        moves = moves % 4 + 1;
		if (moves == 1 || moves == 3) {
			return Direction.NORTH;
		} else if (moves == 2) {
			return Direction.WEST;
		} else {
			return Direction.EAST;
		}
    }

    public String toString() {
        if (moves % 2 == 0) {
			return "x";
		} else {
			return "-";
		}
    }
}