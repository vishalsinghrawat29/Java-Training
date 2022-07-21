import java.util.Scanner;

public class DoWhileLoop {
    public static void main(StringFunction[] args) {
//        Do while loop syntax and basic example

//        syntax
//        counter variable
//        do{
//          ...code..
//          ...increment/decrement...
//        }while(condition)

//        WAP to print statement number till 10
         int count = 0;
         do{
             System.out.println(count);
             count++;
         }while (count<=10);


//         WAP to add number until user enter zero

          Scanner scanner = new Scanner(System.in);
           double number = 0;
           double sum = 0;

           do{
               System.out.println("Enter a number");
               number = scanner.nextDouble();
               sum += number;
           }while(number != 0);
        System.out.println("The sum is : " + sum);


    }
}
