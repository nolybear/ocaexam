package javalibs;

public class Numbers {
    public static void main(String[] args) {
        longFromStringUsingValueOf("15");
        longFromStringUsingValueOf("2354455");

        longFromStringUsingParse("15");
        longFromStringUsingParse("2354455");

        compareDoubles();
    }

    private static void compareDoubles() {
        Double firstDouble = 3D;
        Double secondDouble = 5D;
        Double thirdDouble = 3D;
        System.out.println(firstDouble.compareTo(secondDouble));

        System.out.format("compareTo: %s %n", firstDouble.compareTo(thirdDouble)); // 0
        System.out.format("== %s %n", firstDouble == thirdDouble); // false
        System.out.format(".equals: %s %n", firstDouble.equals(thirdDouble)); // true
    }

    /**
     * parseLong returns primitive long
     */
    private static void longFromStringUsingParse(String in) {
        long l = Long.parseLong(in);
        System.out.format("longFromStringUsingParse %s : %s %n", in, l);
    }

    /**
     * Long.valueOf returns a Long (wrapper object) instance
     */
    private static void longFromStringUsingValueOf(String in) {
        Long l = Long.valueOf(in);
        System.out.format("longFromStringUsingValueOf %s : %s %n", in, l);
    }
}
