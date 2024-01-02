package Class;
import javax.swing.*;
import java.awt.event.*;

public class Management extends JFrame{
    private static String nomApplication="Management Hotel";
    private final static int WIDTH=200;
    private final static int HEIGHT=100;

    public Management() {
        super(getNomApplication());

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        addWindowListener(l);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
    }

    public static String getNomApplication() {
        return nomApplication;
    }
    public static void main(String[] args) {
        JFrame frame = new Management();
    }
}
