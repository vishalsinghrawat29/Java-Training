import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println("Enter a three digit number: ");
        Scanner scannner = new Scanner(System.in);
        int number = scannner.nextInt();
        if(number>=100 && number<=999){
            System.out.println(number + " is a three digit number");
            int reverse = 0;
            while (number!=0){
                int lastdigit = number%10;
                System.out.println(lastdigit);
                reverse = reverse*10 +lastdigit;
                number = number/10;
            }
            System.out.println("Reverse number : " +reverse);


        }else {
            System.out.println("Please enter three digit number");
        }



    }
}
