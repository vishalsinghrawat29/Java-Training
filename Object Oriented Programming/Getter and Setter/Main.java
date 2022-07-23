public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setLength(12.9f);
        r1.setBreadth(8.7f);

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());


        Dog dog1 = new Dog();
        dog1.setBreed("German Shepherd");
        dog1.setSize(50) ;
        dog1.setColor("Black");

        System.out.println(dog1.getBreed());
        System.out.println(dog1.getSize());
        System.out.println(dog1.getColor());
    }
}