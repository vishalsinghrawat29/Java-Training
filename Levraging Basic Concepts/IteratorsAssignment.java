import java.util.Scanner;

public class IteratorsAssignment {
    public static void main(StringFunction[] args) {
        Scanner scanner = new Scanner(System.in);

//        for loop
        int num;
        System.out.println("Enter a number : ");
        num = scanner.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else {
            for (int i = 2; i <= num; i++) {
                if (num != i) {
                    if (num % i == 0) {
                        System.out.println(num + " is not a prime number");
                        break;
                    }
                } else {
                    System.out.println(num + " is a prime number");
                }

            }

        }

        //        while loop
        System.out.println("Enter a number : ");
        num = scanner.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else {
            int i = 2;
            while (i <= num) {
                if (num != i) {
                    if (num % i == 0) {
                        System.out.println(num + " is not a prime number");
                        break;
                    }
                } else {
                    System.out.println(num + " is a prime number");
                }
                i++;
            }

        }

    }
}
