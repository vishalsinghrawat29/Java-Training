import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Cake Array List
        List<Cake> cakeList = new ArrayList();

        //Create object of cake
        Cake cake1 =  new Cake();
        cake1.setName("Chocolate Brownie");
        cake1.setPrice(250.0f);

        Cake cake2 =  new Cake();
        cake2.setName("Chocolate Maple");
        cake2.setPrice(300.0f);

        //Add object of cake in array list
        cakeList.add(cake1);
        cakeList.add(cake2);


        //Pastry Array List
        List<Pastry> pastryList = new ArrayList();

        //Create object of pastry
        Pastry pastry1 =  new Pastry();
        pastry1.setName("Black Forest");
        pastry1.setPrice(35.0f);

        Pastry pastry2 =  new Pastry();
        pastry2.setName("Choco Truffle");
        pastry2.setPrice(40.0f);

        //Add object of pastry in array list
        pastryList.add(pastry1);
        pastryList.add(pastry2);


        //Print Menu
        System.out.println("      Today's Special Menu      ");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Special Cakes");
        System.out.println("--------------------------------");
        for (Cake cake: cakeList){
            cake.display();
        }
        System.out.println();
        System.out.println("Special Pastries");
        System.out.println("--------------------------------");
        for (Pastry pastry: pastryList){
            pastry.display();
        }



    }
}
class Cake{
    String name;
    float price;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void display(){
        System.out.println(name + " : Rs." + price + " per pound");
    }
}
class Pastry extends Cake {
    @Override
    public void display(){
        System.out.println(name + " : Rs." + price + " per piece");
    }

}