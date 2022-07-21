import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String name;
        int age;
        String bloodGroup;
        String group;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        System.out.print("Enter Blood Group: ");
        bloodGroup = scanner.next();

        if(age>=20){
            group = "RED";
        }else if(age<20 && age>=15){
            group = "BLUE";
        } else if (age<15 && age>=10) {
            group = "YELLOW";
        } else {
            group = "not valid";
        }


        System.out.println("--------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("--------------------------------");
        System.out.println("Your group is " + group);
        System.out.println("--------------------------------");

        scanner.close();
    }
}