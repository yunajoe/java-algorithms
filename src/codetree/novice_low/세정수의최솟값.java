package codetree.novice_low;

import java.util.Scanner;

public class 세정수의최솟값 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int minNumber =0;
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // a가 최소값
        if((a <= b) && (a <= c)){
            minNumber = a;
        }
        // b가 최소값
        else if((b <= a) && (b <= c)){
            minNumber = b;
        }
        // c가 최소값
        else {
            minNumber = c;
        }

        System.out.println(minNumber);
    }
}
