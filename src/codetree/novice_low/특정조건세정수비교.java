package codetree.novice_low;

import java.util.Scanner;

public class 특정조건세정수비교 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a<=b && a<=c){
            System.out.print("1 ");
        }else{
            System.out.print("0");
        }


        if((a == b) && (b == c)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}
