public class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Program Starts"); //Executed
        int[] myArray = {3,45,8,10};

        try {
            int result = myArray[1]/0; //ArithmeticException
            System.out.println(myArray[23]); //ArrayIndexOutOfBoundsException Occured
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException exception){
            //you code --- optional
            System.out.println(exception);
        }finally {
            // Our code --- optionally
            System.out.println("The finally block is always executed");
        }

        System.out.println("Program Ends"); // executed
    }
}
