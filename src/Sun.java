import java.awt.*;

public class Sun {
    private double relX, relY;
    private double relR;
    private double relRayLen;
    private int n;
    private Color c;


    public Sun(double relX, double relY, double relR, double relRayLen, int n, Color c) {
        this.relX = relX;
        this.relY = relY;
        this.relR = relR;
        this.relRayLen = relRayLen;
        this.n = n;
        this.c = c;
    }

    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();
        g.setColor(c);

        int r = (int)(Math.min(panelWidth, panelHeight) * relR);
        int R = (int)(Math.min(panelWidth, panelHeight) * (relR + relRayLen));
        int x = (int)(panelWidth * relX);
        int y = (int)(panelHeight * relY);

        g.fillOval(x-r,y-r,r+r,r+r);
        double da = 2* Math.PI/n;
        for (int i = 0; i<n; i++){
            double a = da * i;
            double x1 = x+r*Math.cos(a);
            double y1 = y+r*Math.sin(a);
            double x2 = x+R*Math.cos(a);
            double y2 = y+R*Math.sin(a);
            g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);


        }
        g.setColor(oldColor);

    }
}


