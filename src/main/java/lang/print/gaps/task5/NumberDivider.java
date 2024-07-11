package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        int dividedNumber = toBeDivided / 5;
        System.out.println(dividedNumber);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        divider.divide(10);
    }
}
