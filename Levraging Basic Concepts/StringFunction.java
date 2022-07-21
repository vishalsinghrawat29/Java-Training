import java.util.Locale;

public class StringFunction {
    public static void main(String[] args) {
        // String Handling
//        index            0   1   2   3   4   5   6    ----> length = 7
        char[] myArray = {'w','e','l','c','o','m','e'};

        String firstString = "Welcome"; //sequnece of characters

        System.out.println(myArray);
        System.out.println(firstString);
        System.out.println(myArray.length);
        System.out.println(firstString.length());

        System.out.println(firstString.charAt(2));

        System.out.println(firstString.toUpperCase());
        System.out.println(firstString.toLowerCase());

        System.out.println(firstString.contains("come"));
        System.out.println(firstString.contains("lome"));

        System.out.println(firstString + " to Intenrshala");

        System.out.println(firstString.concat(" to Intenrshala"));

        System.out.println(firstString.equalsIgnoreCase("WeLcome"));

        String str ="";
        System.out.println(str.isEmpty());

        System.out.println(firstString.indexOf('c'));

        System.out.println(firstString.trim());



    }
}
