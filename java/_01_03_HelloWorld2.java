import java.awt.*;
import javax.swing.*;
public class _01_03_HelloWorld2 {
    public static void main(String[] args) {
        JFrame window = new JFrame() {
            public void paint(Graphics g) {
                super.paint(g);
                g.setFont(new Font("Monotype Corsiva", Font.PLAIN, 32));
                g.drawString("Hello World", 25, 100);
            }
        };
    }
}