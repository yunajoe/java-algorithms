package codetree.novice_low;

import java.util.Scanner;

public class 최대값 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int maxNum = a > b ? a : b;
        System.out.println(maxNum);

    }
}
