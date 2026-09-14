package codetree.novice_low;

import java.util.Scanner;

public class 비교에따른연산 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1 * num2);
        }else{
            System.out.println(num2 / num1);
        }
    }
}
