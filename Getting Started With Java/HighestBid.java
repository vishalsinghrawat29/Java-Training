import java.util.Scanner;

public class HighestBid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Friend1! Enter bid for a Harry Potter antique broomstick: ");
        int bid1 = scanner.nextInt();
        System.out.println("Friend2! Enter bid for a Harry Potter antique broomstick: ");
        int bid2 = scanner.nextInt();
        System.out.println("Friend3! Enter bid for a Harry Potter antique broomstick: ");
        int bid3 = scanner.nextInt();

        int largestBid;
        if(bid1 >= bid2  && bid1 >= bid3 ){
            largestBid = bid1;
        }else if (bid2 >= bid1  && bid2 >= bid3){
            largestBid = bid2;
        }else{
            largestBid = bid3;
        }
        System.out.println("Highest bid: " + largestBid);

    }
}
