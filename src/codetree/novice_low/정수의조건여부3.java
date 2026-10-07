package codetree.novice_low;
import java.util.Scanner;
public class 정수의조건여부3 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 13 == 0 || a % 19 == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
