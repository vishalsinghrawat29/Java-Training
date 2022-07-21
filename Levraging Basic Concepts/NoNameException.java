public class NoNameException {
    public static void main(String[] args) {
        System.out.println("Program Starts"); //Executed
        try{
        String s = null; //no object
        System.out.println(s.length());
        }catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Program Ends"); // executed

        // not recommended approach when you know which type of exception occured


        //Assignment

        try {
            String str = null;
            String s = str.concat("Hello");
            System.out.println(s);
        }catch (NullPointerException exception){
            System.out.println(exception);
        }



    }
}
