public class AbstarctAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Dogs();
        animal1.dogs();

        Animal animal2 = new Cats();
        animal2.cats();
    }
}
abstract class Animal {
    abstract public void cats();
    abstract public void dogs();
}
class Dogs extends Animal{
    @Override
    public void dogs(){ //method override
        System.out.println("Dogs Bark");
    }
    @Override
    public void cats() {

    }
}
class Cats extends  Animal{
    @Override
    public void cats(){ //method override
        System.out.println("Cats Meow");
    }

    @Override
    public void dogs() {

    }
}

