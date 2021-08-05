public class Skunk extends Critter {
    private int moves;
    private boolean hungry;
    
    public void Skunk() {  // constructor
        hungry = false;
    }
    public boolean eat() {
        return true;
    }
    public Direction getmoves() {
        moves++; {
        moves = 0;
        
    }
    if (moves == 1 && moves == 2) {
        return Direction.WEST;
    } else if (hungry) {
        return Direction.NORTH;
    } else if (!hungry) {
        return Direction.SOUTH;
    } else {
        return Direction.EAST;
    }   
  }
  public String toString() {
        return "S";
  }
}