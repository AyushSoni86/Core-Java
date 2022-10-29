import java.util.*;

public class Billing {
    public static void main(String[] args) {
        System.out.println();
        double amount;
        int quantity;
        double discount = 0.0d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount : ");
        amount = sc.nextDouble();
        //amount = amount*quantity;
        System.out.println("Enter the Quantity : ");
        quantity = sc.nextInt();
        double finalamount = amount * quantity;
        if (amount < 5000) {
            discount = finalamount * 0.1;
        } else if (amount >= 5000 && amount < 10000) {
            discount = finalamount * 0.15;
        } else if (amount >= 10000 && amount < 20000) {
            discount = finalamount * 0.2;
        } else {
            discount = finalamount * 0.5;
        }
        System.out.println("**********************************************\n");
        System.out.println(" Final Amount = " + (finalamount) + "\t" + "Discount = " + discount + "\n");
        System.out.println(" Final Bill Amount = " + (finalamount - discount) + "\n");
        System.out.println("**************** Visit Again *****************");
    }
}