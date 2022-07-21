public class MethodOverloading {
    public static void main(String[] args) {
//        method overloading: same method name but different method parameters

        add();
        add(10,45);
        add(5.6f,3.2f);
        add(5.6f,3.2f, 9.6f);

    }
    public static void add(){ //Method1
        int sum = 5+7;
        System.out.println(sum);
    }

    public static void add(int a, int b){ //Method 2
        int sum = a + b;
        System.out.println(sum);
    }
// if we change return type then it don't came in method overloading
//    public static int add(int a, int b){ //Method 2
//        int sum = a + b;
//        System.out.println(sum);
//        return sum;
//    }

    public static void add(float a, float b){ //Method3
        float sum = a + b;
        System.out.println(sum);
    }

    public static void add(float a, float b, float c){ //Method4
        float sum = a + b + c;
        System.out.println(sum);
    }


}
