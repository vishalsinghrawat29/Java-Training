public class OneDArray {
    public static void main(StringFunction[] args) {

//        Array can't intialize in two steps ;
//        float[] myArray;
//        myArray = {34.2f, 4.6f, 78.11f};

//        intialize in none steps;
        float[] myArray = new float[3];
        myArray[0] = 34.2f;
        myArray[1] = 4.6f;
        myArray[2] = 78.11f;

// Print all value of elements
        for (int i =0; i<myArray.length ; i++){
            System.out.println(myArray[i]);
        }


//        Print with for each loop - no need to use counter loop
        for (float num: myArray){
            System.out.println(num);
        }


//        WAP to find sum of all elements in array
        int[] intArray = {29,19,48, 7};
        int sum = 0;
        for (int i =0 ; i<intArray.length ; i++){
            sum += intArray[i];
            System.out.println(intArray[i]);
        }
        System.out.println("Sum on intArray: "+ sum);

//        for float
        float sumOfNumbers = 0;
        for (int i =0 ; i<myArray.length ; i++){
            sumOfNumbers += myArray[i];
            System.out.println(myArray[i]);
        }
        System.out.println("Sum on floatArray: "+ sumOfNumbers);


//        Assignment
        double[] arrayDouble = {3.4,8.9,4.3,3.4};
        double sumDouble = 0;
        for (double num: arrayDouble){
            sumDouble += num;
            System.out.println(num);
        }
        System.out.println("Sum of Double Array: "+ sumDouble);


    }
}
