public class Main {
    public static void main(String[] args) {

        Area area1 = new Area();
        area1.area(3);
        area1.area(3,4);
        area1.area(3,3);


    }
}

class Area{
    public void area(int length, int breadth){
        int area =  length*breadth;
        System.out.println("Area of Rectangle/Square is "+ area);
    }
    public void area(int radius){
        double area = 3.14*radius*radius;
        System.out.println("Area of Circle: " + area);
    }
}