public class Array {
    public static void main(StringFunction[] args) {

//        array initalization
        int[] myFirstArray;
        float[] mySecondArray;
        char[] myThirdArray;
        double[] myFourthArray;
        boolean[] myFifthArray;
        StringFunction[] myStringArray;

//        insert data into array
//    index               0  1  2  3
        int[] myArray = {29,19,48, 7};

//        Access Element of Array
        System.out.println(myArray[2]);


//        System.out.println(myArray[30]);
//        ArrayIndexOutOfBoundException error


//        To change value of array element
        myArray[2] = 37;
        System.out.println(myArray[2]);

//        Length of Array
        System.out.println(myArray.length);

//        Print all element of array
        for (int i =0; i<myArray.length ; i++){
            System.out.println(myArray[i]);
        }

//        When we define array we can't add more element to array
//        myArray[4] = 89 -> not possible





    }

}
