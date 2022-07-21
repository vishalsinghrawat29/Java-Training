public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Program Starts"); //Executed
        int[] myArray = {3,45,8,10};

        try {
            System.out.println(myArray[23]); //ArrayIndexOutOfBoundsException Occured
        }catch(ArrayIndexOutOfBoundsException exception){
            //you code --- optional
            System.out.println(exception);
        }finally {
            // Our code --- optionally
            System.out.println("The finally block is always executed");
        }

        System.out.println("Program Ends"); // executed
    }
}
