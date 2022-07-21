import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tax Calculator App");
        System.out.println("----- WELCOME -----");

        Scanner myobj1 =new Scanner(System.in);
        System.out.println("Enter total person count:");
        int personCount = myobj1.nextInt();

        String[] nameOfPerson = new String[personCount];
        long[] personIncome = new long[personCount];

        for (int i = 0; i < personCount; i++){
            Scanner myobj2 =new Scanner(System.in);
            System.out.println("Enter name "+ (i+1) + ":");
            nameOfPerson[i] = myobj2.nextLine();
            System.out.println("Enter "+ nameOfPerson[i] + "`s Annual Income:");
            personIncome[i] = myobj2.nextInt();
        }
        System.out.println("Names with liable taxes");
        System.out.println("—————————————");
        for (int i = 0; i < personCount; i++){
            calculateTax(nameOfPerson[i], personIncome[i]);
        }
    }
    public static void calculateTax(String name, long income){
        long tax = 0;
        if (income >= 300000){
            tax = (20*income)/100;
        } else if (income <= 100000 && income >= 300000) {
            tax = (10*income)/100;
        } else if (income >= 100000) {
            tax = 0;
        }
        System.out.println( name + ": Rs." + tax);
    }
}