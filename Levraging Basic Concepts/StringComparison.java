public class StringComparison {
    public static void main(String[] args) {

        // using literals create string
        String firstString = "Welcome";  // S1
        String secondString = "Welcome";  //S1

        // Using new Keyword
        String thirdString = new String("Welcome");  //S2

        System.out.println(firstString == secondString);
//      Comparing Objects in comparison -- compare s1 and s1

        System.out.println(firstString == thirdString);
//        compare s1 and s2

        System.out.println(firstString.equals(thirdString));
        // compare s1.value and s2.value
//        Equals compare object values


    }
    }
