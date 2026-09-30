package codetree.novice_low;

import java.util.Scanner;

public class 삼OR오의배수 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A % 3 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        if(A % 5 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
