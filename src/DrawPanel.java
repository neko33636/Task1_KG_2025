import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    Sun s1;
    public DrawPanel() {

        s1 = new Sun(0.5, 0.5, 0.1, 0.05, 42, Color.YELLOW);

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        gr.setColor(Color.RED); // голубой фон
        gr.fillRect(0, 0,getWidth(),getHeight());
        Graphics2D g = (Graphics2D) gr;
        s1.draw(g,getWidth(),getHeight());



    }

}
