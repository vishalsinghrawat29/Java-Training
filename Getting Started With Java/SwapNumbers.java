import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number1 : ");
        int a = scanner.nextInt();
        System.out.println("Enter Number2 : ");
        int b = scanner.nextInt();
        System.out.println("Before swapping number1: "+ a + " and number2: "+ b);
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swapping number1: "+ a + " and number2: "+ b);
    }
}
