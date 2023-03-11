import javax.swing.*;
import java.awt.*;

public class Main {
    private JPanel panel;

    public Main() {
        panel.setPreferredSize(new Dimension(700,500));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(300,200);
        System.out.println("prueba git");
    }
}
