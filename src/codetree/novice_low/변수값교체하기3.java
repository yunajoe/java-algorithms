package codetree.novice_low;

public class 변수값교체하기3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
