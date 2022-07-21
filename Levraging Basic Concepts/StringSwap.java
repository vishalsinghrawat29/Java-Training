public class StringSwap {
    public static void main(String[] args) {
        String f1 = "Harry";
        String f2 = "Drake";
        System.out.println("Brfore Swapping");
        System.out.println("f1: " + f1 + ", f2: " + f2);

        System.out.println("After Swapping");
        f1 = f1 + f2;
        f2 = f1.substring(0,(f1.length() - f2.length()));
        f1 = f1.substring(f2.length());
        System.out.println("f1: " + f1 + ", f2: " + f2);



    }
}
