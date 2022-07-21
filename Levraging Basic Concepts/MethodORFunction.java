public class MethodORFunction {
    public static void main(String[] args) {
    sayHello();
    sayHello();
    sayHello();
    sayHello();


        // WAP for Simple Interest SI = P*R*T/100;

        //user 1
        int principal1 = 10000;
        float rateofInterest1 = 8.7f;
        int timePeriod1 =  2;
        double si1 = principal1*rateofInterest1*timePeriod1 / 100;
        System.out.println(si1);

        //user 2
        int principal2 = 130000;
        float rateofInterest2 = 10.5f;
        int timePeriod2 =  4;
        double si2 = principal1*rateofInterest1*timePeriod1 / 100;
        System.out.println(si2);


//        ...user3...
//        ..,user4...

//        Bad Practise to code
        return;
    }
    public static void sayHello(){
        System.out.println("Hello");
        return;
    }






}
