package codetree.novice_low;

public class 변수값복사하기 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        a = b = c; // 3
        System.out.println(a + " " + b + " " + c);
    }
}
