public class ExceptionHandling {
    public static void main(String[] args) {
        // Problem Statement

        System.out.println("Program Starts"); //Executed
        int[] myArray = {3,45,8,10};
        System.out.println(myArray[1]);
        System.out.println(myArray[23]); //Exception Occured
        //java.lang.ArrayIndexOutOfBoundsException
        System.out.println("Program Ends"); // not executed


        //Case1 -- try catch
        //Case 2 -- multiple exception - multi-catch
        //Case3 -- don't know exception name



    }
}
