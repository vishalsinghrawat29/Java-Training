public class InterfacePerimeter {
    public static void main(String[] args) {

        perimeter perimeter1 = new ShapePerimeter();
        perimeter1.getPerimeter(3);
        perimeter1.getPerimeter(3,4);
        perimeter1.getPerimeter(3,3);

    }
}
interface perimeter{
    void getPerimeter(int length, int breadth);
    void getPerimeter(int radius);
}

class ShapePerimeter implements perimeter{
    @Override
    public void getPerimeter(int length, int breadth) {
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter of Rectangle/Square : " + perimeter);
    }

    @Override
    public void getPerimeter(int radius) {
        double perimeter = 2*3.14*(radius);
        System.out.println("Perimeter of Circle : " + perimeter);

    }
}

