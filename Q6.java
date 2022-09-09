import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 6;
        System.out.println((r.nextInt(high-low) + low));
}}
