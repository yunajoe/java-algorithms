package codetree.novice_low;

import java.util.Scanner;

public class 정사각형의넓이 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = num * num;
        System.out.println(result);
        if(num < 5){
            System.out.println("tiny");
        }
    }
}
