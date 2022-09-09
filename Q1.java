import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(15, 5, 20, 30);
        System.out.println("Expected:\nPerimeter= 100");
        System.out.println("Actual:\nPerimeter= "+(2*(box.getHeight()+box.getWidth())));
        System.out.println("-------------------------------------");
    }
}
