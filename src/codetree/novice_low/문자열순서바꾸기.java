package codetree.novice_low;

import java.util.Scanner;

public class 문자열순서바꾸기 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char a;
        double b, c;

        a = sc.next().charAt(0);
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.println(a);
        System.out.printf("%.2f\n%.2f\n", b, c);
    }
}
