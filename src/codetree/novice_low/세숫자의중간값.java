package codetree.novice_low;

import java.util.Scanner;

public class 세숫자의중간값 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if((b > a) && (b < c)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
