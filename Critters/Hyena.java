public class Hyena extends Critter {
    private int moves;
    private int width;
    public Hyena() {
        moves = 0;
        width = 1;
    }

    public boolean eat() {
        moves = 0;
        width++;
        return true;
    }
    public Direction getMove() {
        moves++;
        if (moves > 2 * width + 2) {
        moves = 1;
        width++;
    }

        if (moves == 1) {
         return Direction.NORTH;
      } else if (moves <= width + 1) {
         return Direction.EAST;
      } else if (moves == width + 2) {
         return Direction.SOUTH;
      } else {
         return Direction.WEST;
      }
   }
} 
