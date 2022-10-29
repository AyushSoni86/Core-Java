package PracticeProblems;

import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {
        int i, j, n;
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (j = n ; j >= i; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}