public class Main {
    public static void main(String[] args) {

        // new animal();
        // Not Allowed. Cannot create objects of abstarct class.

        Animal animal;
        //Allowed. You can create refrence of abstarct class


//        Animal animal1 = new Animal();
//        refrence variable ---> own class NOT ALLOWED in ARSTRACT

//        parent class refrence  -- > child class object
        Animal animal2 = new Dog();
        animal2.run();
        animal2.eat();
    }
}

abstract class Animal{
    public void run(){
        System.out.println("Animal is running");
    }
    abstract public void eat(); // no body for abstract method
}
class Dog extends Animal{

    //normal method can may or may not override -- optional

    @Override
    public void eat(){ //method override
        System.out.println("Dog is eating");
    }
}

/*
Rules for abstract keyword:
        1. abstract class:
            * A class that is declared abstract
            * You cannot create object of abstract class
            * It may or may not contain abstract methods

        2. abstract method:
            * No method body. You cannot write code in abstract method.
            * It is mandatory to override the abstract method in child class.
 */