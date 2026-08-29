package codetree.novice_low;

public class 합을복사하기 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int sum = a + b + c;
        a = b = c = sum;
        System.out.println(a + " " + b + " " + c);
    }
}
