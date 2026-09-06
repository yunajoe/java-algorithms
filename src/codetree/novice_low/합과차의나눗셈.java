package codetree.novice_low;

import java.util.Scanner;

public class 합과차의나눗셈 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int diff = a - b;
        System.out.printf("%.2f", (double) sum / diff);
    }
}
