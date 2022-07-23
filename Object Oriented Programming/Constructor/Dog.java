public class Dog {
    public String breed; //instance variable
    public int size; //instance variable
    public String color; //instance variable

    public Dog(){ // Default Constructor
        System.out.println("Triggered Default Constructor");
    }
    public Dog(String b, int s, String c){ //Parameterized Constructor
        breed =b;
        size =s;
        color = c;
    }
}
