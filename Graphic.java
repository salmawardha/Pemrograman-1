import Java.*;

public class PrettyPicture {
    public static void main(String[] args) {
        DrawingPanel panel = DrawingPanel(220, 150);
        setBackgroundColor(Color.YELLOW);
        
        Graphics g = panel.Graphics();
        panel.setColor(new Color.BLUE);
        g.drawRectangle(50, 25);
        g.setColor("RED");
        g.fillEllipse(130, 25, 42.1, 40.5);
    }
}