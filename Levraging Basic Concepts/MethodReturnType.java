public class MethodReturnType {
    public static void main(String[] args) {
        //WAP to calculate a simple interest and print a result in main function itself
        double si1 =  simpleInterest(10000, 8.7f,2);
        System.out.println(si1);

        double si2 = simpleInterest(130000, 10.5f,4);
        System.out.println(si2);

        double si3 = simpleInterest(4000, 12.7f,8);
        System.out.println(si3);


//      Assignment  - WAP to find the sum of two numbers and print the sum by returning the value from the method.
        int sum1 = add(4,8);
        System.out.println(sum1);

    }
    public static double simpleInterest(int principal, float rateofInterest, int timePeriod){
        double si = principal*rateofInterest*timePeriod / 100;
        return si;
    }
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
