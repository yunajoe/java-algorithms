package codetree.novice_low;

import java.util.Scanner;

public class 전화번호바꾸기 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("-");
        System.out.println(arr[0] + "-" + arr[2] + "-" + arr[1]);
    }
}
