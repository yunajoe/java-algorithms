package codetree.novice_low;

import java.util.Scanner;

public class 실수입력받아계산2 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double result = (double) sc.nextDouble() + 1.5;
        System.out.printf("%.2f", result);
    }
}
