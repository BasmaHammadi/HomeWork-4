import java.awt.Color;
import javax.swing.*;

public class Q10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        JLabel label = new JLabel("Hello, World!");
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        frame.add(label);
        frame.setSize(400, 400);
        label.setText("Hello, Basma!");
        label.setBackground(new Color(0x2EC23D));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); } }
