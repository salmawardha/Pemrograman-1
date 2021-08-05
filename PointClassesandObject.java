import java.awt.*;
public class PointClassesandObject {
    int x;                                   
    int y;                                   

    public void draw(Graphics g) {           
        g.fillOval(x, y, 3, 3);
        g.drawString("(" + x + ", " + y + ")", x, y);
    }

    public void translate(int dx, int dy) {  
        x = x + dx;                          
        y = y + dy;
    }

    public double distanceFromOrigin() {         
        double dist = Math.sqrt(x * x + y * y);  
        return dist;
    }
}
