import javax.swing.*;
import java.awt.*;

public class Q8 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("MY NAME");
        frame.setSize(500,500);
        frame.setLocation(550,200);
        NameComponent component=new  NameComponent();
        frame.add(component);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class  NameComponent extends JComponent {
    protected void paintComponent(Graphics g) {
        Rectangle rectangle1=new Rectangle(150,50,200,100);
        Graphics2D g2= (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.fill(rectangle1);
        g2.setColor(Color.red);
        g2.drawString("BASMA",230,100);


    }
}
