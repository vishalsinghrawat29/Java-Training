public class Main {
    public static void main(String[] args) {

// 1. CLASSES AND OBJECT

//Creating object of string class
        String str = new String();

        //Dog1
        Dog dog1 = new Dog();
        dog1.breed = "German Shepherd";
        dog1.size = 50;
        dog1.color = "Black";

        dog1.bark();
        dog1.run();

        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);

        //Dog2
        Dog dog2 = new Dog();
        dog2.breed = "Labrador";
        dog2.size =35;
        dog2.color = "Brown";

        dog2.bark();
        dog2.run();

        System.out.println(dog2.breed);
        System.out.println(dog2.size);
        System.out.println(dog2.color);


        Rectangle r1 = new Rectangle();
        r1.breadth = 8.7f;
        r1.length = 12.9f;

        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Rectangle r2 = new Rectangle();
        r2.breadth = 15.6f;
        r2.length = 10.0f;

        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());


        CakeCodeChallenge cake1 = new CakeCodeChallenge();
        cake1.cakeName = "Black Forest";
        cake1.price = 2000;
        cake1.flavour = "Strawbery";
        cake1.isAvaialble = true;

        System.out.println(cake1.cakeName);
        System.out.println(cake1.price);
        System.out.println(cake1.flavour);
        System.out.println(cake1.isAvaialble);

    }
}