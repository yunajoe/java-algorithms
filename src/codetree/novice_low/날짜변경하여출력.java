package codetree.novice_low;

import java.util.Scanner;

public class 날짜변경하여출력 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split(":");
        // Integer.parseInt: 문자열(String) 형태의 숫자를 기본형 정수(int)로 변환
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        h++;
        System.out.println(h + ":" + m);

    }
}
