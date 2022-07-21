public class TwoDArray {
    public static void main(StringFunction[] args) {
        int[] firstArray = { 3,5,1,9};
        int[] secondArray = { 10,15,3,0};
        int[] thirdArray = { 1,11,31,90};
        int[] fourthArray = { 2,51,1,9};

        int[][] myFirst2DArray = { firstArray, secondArray, thirdArray, fourthArray };
//        Or
        int[][] my2DArray = {
                                { 3,5,1,9} ,
                                { 10,15,3,0},
                                { 1,11,31,90},
                                { 2,51,1,9}
                            };

//        Access element of array
        System.out.println(my2DArray[3][3]);


//        Print all elements of Array
        for (int row=0 ; row<my2DArray.length; row++){
            for (int column=0 ;  column<my2DArray[row].length; column++){
                System.out.print(my2DArray[row][column] + " ");
            }
            System.out.println();
        }

//        Assignment
//        WAP to find sum od all element of 2d Array
        int sum = 0;
        for (int row=0 ; row<my2DArray.length; row++){
            for (int column=0 ;  column<my2DArray[row].length; column++){
                sum += my2DArray[row][column];
                System.out.print(my2DArray[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of element of 2D Array: " + sum);




    }
}
