import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        MainWindow mw = new MainWindow();
        mw.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mw.setSize(800,600);
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBackground(Color.RED); // ставим цвет

        mw.setVisible(true);

    }
}