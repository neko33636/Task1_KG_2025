import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
//        g.drawLine(10,10,200,100);
//        DrawingUtils.drawSun(g,200,100,50,90, 15, Color.ORANGE);
        Sun s1 = new Sun(200,100,50,90,15,Color.BLACK);
        s1.draw(g);



    }
    private static void drawSun (Graphics2D g, int x, int y, int r, int R, int n, Color c){
        g.drawOval(x,y,r,r);
    }

}
