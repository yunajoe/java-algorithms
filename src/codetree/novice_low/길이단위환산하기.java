package codetree.novice_low;

import java.util.Scanner;

public class 길이단위환산하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet = 30.48;
        double result = (double) sc.nextDouble() * feet;
        System.out.printf("%.1f", result);
    }
}


