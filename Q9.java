import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Q9 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("MY NAME");
        frame.setSize(500,500);
        frame.setLocation(550,200);
        TrafficComponent component=new  TrafficComponent();
        frame.add(component);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class   TrafficComponent extends JComponent {
    protected void paintComponent(Graphics g) {
        Rectangle rectangle1=new Rectangle(200,50,100,300);
        Graphics2D g2= (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fill(rectangle1);
        Ellipse2D.Double circle1=new Ellipse2D.Double(225,70,50,50);
        g2.setColor(Color.red);
        g2.fill(circle1);
        Ellipse2D.Double circle2=new Ellipse2D.Double(225,160,50,50);
        g2.setColor(Color.green);
        g2.fill(circle2);
        Ellipse2D.Double circle3=new Ellipse2D.Double(225,250,50,50);
        g2.setColor(Color.yellow);
        g2.fill(circle3);


    }
}
