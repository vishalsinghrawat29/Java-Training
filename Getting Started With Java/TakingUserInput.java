import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        String name;
        int population;
        float populationDensity;
        double GDP;
        char currency;
        boolean isSecular;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your country name : ");
        name= scanner.nextLine();
        System.out.println("Your country name is : " + name);

        System.out.println("Enter population : ");
        population= scanner.nextInt();
        System.out.println("The population of country is : " + population);
        scanner.close();
    }
}
