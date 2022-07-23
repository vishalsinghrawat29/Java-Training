public class Main {
    public static void main(String[] args) {
        // Always use getter and setter. this sample code is meant to explain Inheritance concept
        Dog dog = new Dog();
        dog.run();

        Animal animal1 =  new Animal();  //animal1 --> A
        animal1.run(); // Animal is running

        Animal animal2 = new Dog(); //animal2 --> D [Upcasting]
        animal2.run(); // Dog is running

        // UPCASTING
        // super class = child class

        // child class = parent class  --> NOT ALLOWED
        Dog dog1 = (Dog)new Animal(); //Downcasting{ in this some data lose}
    }
}
class Animal{
    public void run(){
        System.out.println("Animal is running");
    }
}

class Dog extends Animal{
    //method overriding
    public void run(){
//        super.run();
        System.out.println("Dog is running");
//        super.run();
    }
}

