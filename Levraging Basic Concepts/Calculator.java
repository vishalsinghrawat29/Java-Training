import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = scanner.nextInt();
        calc(num1,num2);
    }
    public static void calc(int a, int b){
        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
    }
    public static void add(int a, int b){
        int add = a+b;
        System.out.println("Add = " + add);
    }
    public static void mul(int a, int b){
        int mul = a*b;
        System.out.println("Mul = " + mul);
    }
    public static void sub(int a, int b){
        int sub = a-b;
        System.out.println("Sub = " + sub);
    }
    public static void div(int a, int b){
        if (b==0){
            System.out.println("Div = Divide by 0 is not allowed");
        }else {
            int div = a/b;
            System.out.println("Div = " + div);
        }

    }
}
