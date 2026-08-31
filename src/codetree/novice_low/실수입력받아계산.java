package codetree.novice_low;

import java.util.Scanner;

public class 실수입력받아계산 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("%.2f", a + b);
    }
}
