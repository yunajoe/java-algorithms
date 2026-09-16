package codetree.novice_low;

import java.util.Scanner;

public class 살수있는물건 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int bookPrice = 3000;
        int maskPrice = 1000;
        int money = sc.nextInt();
        if(money >= bookPrice){
            System.out.println("book");
        }else if(money >=maskPrice){
            System.out.println("mask");
        }else{
            System.out.println("no");
        }

    }
}
