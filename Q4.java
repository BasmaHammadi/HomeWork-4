import java.awt.*;

public class Q4 {
    public static void main(String[] args) {
//        Rectangle box = new Rectangle(5, 10, 20, 30);
//        box.add(0, 0);
//        the result will be: x=0, y=0, width=25, height=40.
        Rectangle box = new Rectangle(15, 5, 20, 30);
        System.out.println("Expected:\nLocation= (0, 0)");
        System.out.println("Width= 35");
        System.out.println("Height= 35");
        System.out.println("-------------------------------------");
        box.add(0, 0);
        System.out.println("Actual:\nLocation= ("+box.getX()+", "+box.getY()+")");
        System.out.println("Width= "+box.width);
        System.out.println("Height= "+box.height);
        System.out.println("-------------------------------------");
    }
}
