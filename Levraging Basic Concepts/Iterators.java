public class Iterators {
    public static void main(StringFunction[] args) {
        /* WAP to find odd number from 0 to 4 */

//        if(1 % 2 != 0)
//            System.out.println(1);
//        if(2 % 2 != 0)
//            System.out.println(2);
//        if(3 % 2 != 0)
//            System.out.println(3);
//        if(4 % 2 != 0)
//            System.out.println(4);

        int number = 1;
        if(number % 2 != 0)
            System.out.println(number);

        number++;
        if(number % 2 != 0)
            System.out.println(number);

        number++;
        if(number % 2 != 0)
            System.out.println(number);

        number++;
        if(number % 2 != 0)
            System.out.println(number);

//        for many number this method is not good
//        for this we use iterators

    }
}
