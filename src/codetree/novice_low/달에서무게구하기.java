package codetree.novice_low;

public class 달에서무게구하기 {
    public static void main(String[] args) {
        int weight = 13;
        double gravity = 0.165;
        double result = (double) weight * gravity;
        System.out.printf("%d * %.6f = %.6f", weight, gravity, result);
    }
}
