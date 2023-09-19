import java.util.Scanner;

public class salesTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            double salesTax = 0.05;
            int cost;


            System.out.println("What is your starting money");
            cost = scan.nextInt();

            double costSalesTax = salesTax * cost;

            System.out.println("");
            System.out.println("Your sales tax = $" + costSalesTax);
    }
}