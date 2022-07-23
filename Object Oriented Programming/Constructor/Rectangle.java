public class Rectangle {
    public float length; //instance variable
    public float breadth; //instance variable

    //Constructor
//    public Rectangle(){ //Default Constructor
//        // your code..
//        System.out.println("Default Constructor Triggered");
//    }
//
//    public Rectangle(float l){ //Parameterized Constructor
//        // your code..
//        length = l;
//    }

//    public Rectangle(float l, float b){ //Parameterized Constructor
//        // your code..
//        length = l;
//        breadth = b;
////        System.out.println("Parameterized Constructor Triggered");
//    }

    // this keyword -- this refer current instance

    public Rectangle(){
        this(20.4f, 10.2f);
        // call parameter constructor
    }

    public Rectangle(float length){
        this.length = length;
    }
    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }


    //area, perimeter
    public float getArea(){
        float area = length*breadth; //local variable
        return area;
    }

    public float getPerimeter(){
        float perimeter = 2*(length+breadth); //lacal variable
        return perimeter;
    }
}
