public class MethodRescue {
    public static void main(String[] args) {

        simpleInterest(10000, 8.7f,2);
        simpleInterest(130000, 10.5f,4);
        simpleInterest(4000, 12.7f,8);
    }
    public static void simpleInterest(int principal, float rateofInterest, int timePeriod){
        double si = principal*rateofInterest*timePeriod / 100;
        System.out.println(si);
    }
}
