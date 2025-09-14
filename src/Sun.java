import java.awt.*;

public class Sun {
    private int x,y,r,R,n;
    private Color c;

    public Sun(int x, int y, int r, int rayLenght, int n, Color c) {
        this.y = y;
        this.x = x;
        this.r = r;
        this.R = r+rayLenght;
        this.n = n;
        this.c = c;
    }

    public void draw(Graphics2D g){
        DrawingUtils.drawSun(g,x,y,r,R,n,c);
    }
}
