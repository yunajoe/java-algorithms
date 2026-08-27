package codetree.novice_low;

public class 데이터교환 {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int tempA = a;
        a = c;
        c = b;
        b = tempA;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
