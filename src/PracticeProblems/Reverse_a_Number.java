package PracticeProblems;

import java.util.*;

class Reverse_a_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int org = num;
        while (num > 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        System.out.println(" The reverse of " + org + "  is " + rev);

    }
}