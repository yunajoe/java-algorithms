package codetree.novice_low;

import java.util.Scanner;

public class 시력검사2 {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double sight = sc.nextDouble();
        if(sight >=1.0){
            System.out.println("High");
        }else if(sight >=0.5){
            System.out.println("Middle");
        }else{
            System.out.println("Low");
        }
    }
}
