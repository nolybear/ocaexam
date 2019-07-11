public class OperatorPrecedence {

    public static void main(String[] args) {
        incDec();
        postfixVsMultiply();
    }

    private static void incDec() {
        int i = 3, j = 2;

        // (3 + 1) + (2 + 1)
        int result = i-- + --j + ++i;
        System.out.println("incDec: " + result);
    }

    private static void postfixVsMultiply() {
        int x = 1;
        int y = 2;
        int z = 3;

        System.out.println(x++ * y++ * --z); // ==4

    }
}
