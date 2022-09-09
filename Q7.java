import javax.swing.*;
import java.awt.*;

public class Q7 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Rectangle");
        frame.setSize(500,500);
        frame.setLocation(550,200);
        TwoSquareComponent component=new  TwoSquareComponent();
        frame.add(component);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
}
}
 class  TwoSquareComponent extends JComponent {
    protected void paintComponent(Graphics g) {
        Rectangle rectangle1=new Rectangle(150,50,200,100);
        Rectangle rectangle2=new Rectangle(150,200,200,100);
        Graphics2D g2= (Graphics2D) g;
        g2.setColor(new Color(0x9A58BE));
        g2.fill(rectangle1);
        g2.setColor(Color.pink);
        g2.fill(rectangle2);



    }
}
