import java.util.Scanner;

public class ArrayComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        for (int i = 0; i < array1.length ; i++){
            System.out.println("Enter " + (i+1) + " element of array");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Your Array: ");
        for (int i = 0; i < array1.length ; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.println("...Creating Array 2....");
        int[] array2 = new int[size];
        for (int i = 0; i < array2.length ; i++){
            array2[i] = array1[i];
        }
        System.out.println("..comparing array1 and array 2...");
        System.out.println(array1 == array2);
        System.out.println("fasle -- because it create 2 object");




    }
}
