package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        // (float) ensures that the division is performed in floating-point arithmetic, giving the correct result of 3.8.
        float dividedNumber = (float) toBeDivided / 5;
        System.out.println(dividedNumber);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        divider.divide(19);
    }
}
