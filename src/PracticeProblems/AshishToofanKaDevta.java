import java.util.*;

public class AshishToofanKaDevta {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(" 1.Addition ");
        System.out.println(" 2.Substraction ");
        System.out.println(" 3.Multiplication ");
        System.out.println(" 4.Division ");
        System.out.println(" 5.Modulus ");


        c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Tera input Invaild he! \n Ghar jaake sooja \n tere bas ki nahi munna");
        }
    }
}