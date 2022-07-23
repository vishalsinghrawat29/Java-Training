public class Main {
    public static void main(String[] args) {
        // Always use getter and setter. this sample code is meant to explain Inheritance concept
        Dog dog = new Dog();
        dog.name = "Labrador";
        dog.color = "Black";
        dog.bark();
        dog.run();

        Cat cat = new Cat();
        cat.name = "Persian Cat";
        cat.pattern = "tabby";
        cat.meow();
        cat.run();

        Animal animal = new Animal();
        animal.name = "my animal";
        animal.run();

        Puppy puppy = new Puppy();
        puppy.name="puppy1";
        puppy.color = "White";
        puppy.size = 20;
        puppy.age = 3;
        puppy.run();
        puppy.bark();
        puppy.play();


    }
}
class Animal{
   String name;
   public void run(){
       System.out.println("Animal is running");
   }
}

class Dog extends Animal{
    String color;
    public void bark(){
        System.out.println("Wooh! Wooh!");
    }
}

class Cat extends Animal{
    String pattern;
    public void meow(){
        System.out.println("Meow! Meow!");
    }
}

// Multilevel Inheritance
class Puppy extends Dog{
    int size;
    int age;
    public void play(){
        System.out.println("yeah!");
    }
}