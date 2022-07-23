public class Rectangle {
    private float length; //instance variable
    private float breadth; //instance variable

    // never make instance variable public

    public float getArea(){
        float area = length*breadth; //local variable
        return area;
    }

    public float getPerimeter(){
        float perimeter = 2*(length+breadth); //lacal variable
        return perimeter;
    }

    //Getter and Setter
    public float getLength(){ // getter for length
        return length;
    }
    public void setLength(float length){ // setter for length
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
}
