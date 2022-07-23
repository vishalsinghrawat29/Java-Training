public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(); // Rectangle() -->  trigger default constructor
        r1.breadth = 8.7f;
        r1.length = 12.9f;

        // r1 --> this
        // this refer to current refrence variable or current object variable


        Rectangle r2 = new Rectangle(20.4f,18.2f);
        System.out.println(r2.length);
        System.out.println(r2.breadth);

        // r2 --> this
    }
}