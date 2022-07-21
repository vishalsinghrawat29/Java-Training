public class VariableName {
    public static void main(String[] args) {
        String name = "India";
        int population = 1226572000;
        float populationDensity = 393.0f;
        double GDP = 2.454;
        char currency = '\u20B9';
        boolean isSecular = true;

        System.out.println(name+" has population of "+ population + " and population density of "+ populationDensity+ " person per sq. km.");

        //implicit conversion
        int radius =  400;
        double newRadius = radius;
        System.out.println("New radius [implicit conversion] : " + newRadius);

        //explicit conversion
        double diameter =  400;
        int newDiameter = (int) diameter;
        System.out.println("New diameter [explicit conversion] : " + newDiameter);

        long diamtr = 7878787878L;
        int newDiamtr = (int) diamtr;
        System.out.println("New diamtr [explicit conversion] : " + newDiamtr);
    }
}
