public class Q3 {
    public static void main(String[] args) {
        String x="Mississippi";
        x=x.replace("i","!");
        x=x.replace("s","$");
        System.out.println("Expected: M!$$!$$!pp!");
        System.out.println("Actual:   "+x);
}
}
