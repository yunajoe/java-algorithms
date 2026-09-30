package codetree.novice_low;

import java.util.Scanner;

public class 점수비교 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int aMath, aEng;
        int bMath, bEng;

        aMath = sc.nextInt();
        aEng = sc.nextInt();
        bMath = sc.nextInt();
        bEng = sc.nextInt();

        if((aMath > bMath) && (aEng > bEng)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
