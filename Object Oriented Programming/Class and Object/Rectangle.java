public class Rectangle {
    //length,breadth
    public float length; //instance variable
    public float breadth; //instance variable

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
