import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length ; i++){
            System.out.println("Enter " + (i+1) + " element of array");
            array[i] = scanner.nextInt();
        }
        System.out.println("Your Array: ");
        for (int i = 0; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();




        System.out.println("Sorted Array : ");
        for (int i =0 ; i< array.length; i++){
            for (int j = i+1; j<array.length;j++){
                int tmp = 0;
                if (array[i]> array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.print(array[i] + " ");
        }



    }
}
