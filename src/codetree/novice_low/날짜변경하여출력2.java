package codetree.novice_low;

import java.util.Scanner;

public class 날짜변경하여출력2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        System.out.println(year + "." + month + "." + day);
    }
}
