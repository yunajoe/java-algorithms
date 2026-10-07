package codetree.novice_low;

import java.util.Scanner;

public class 범위밖의수 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 10 || a > 20){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
