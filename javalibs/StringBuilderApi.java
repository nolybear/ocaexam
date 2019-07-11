package javalibs;

public class StringBuilderApi {

    public static void main(String[] args) {
        defaultCapacity();
        capacityChangeWithDelete();
        setLength();
    }

    private static void defaultCapacity() {

        // Output 16
        // A new StringBuilder without constructor parameter creates builder with initial capacity of 16
        StringBuilder emptyBuilder = new StringBuilder();
        System.out.format("emptyBuilder capacity: %s \n", emptyBuilder.capacity());

        // Outputs 21.
        // Length of initialising String + default of 16
        StringBuilder builderWith5CharString = new StringBuilder("12345");
        System.out.format("5CharBuilder capacity: %s \n", builderWith5CharString.capacity());
    }

    private static void capacityChangeWithDelete() {
        StringBuilder sb = new StringBuilder("abcdef"); // capacity now 22 (string length + 16)
        sb.delete(4,6); // delete chars from index 4 (inclusive, starts at 0) to 6-1, in effect e+f
        System.out.println("capacityChangeWithDelete: " + sb.capacity()); // capcity 22
        sb.ensureCapacity(22);
        System.out.println("capacityChangeWithDelete: " + sb.capacity()); // capcity 22
        sb.ensureCapacity(23); // minimum (23) is larger than current capacity (23) so capacity is increased by current.capacity*2 +2
        System.out.println("capacityChangeWithDelete: " + sb.capacity()); // capcity 46
    }

    private static void setLength() {

        StringBuilder sb = new StringBuilder("123456789");
        System.out.println("setLength pre capacity: " + sb.capacity()); // string.length + 16 = 25
        sb.setLength(3);

        System.out.println("setLength capacity: " + sb.capacity()); // not affected by setLength, still 25
        System.out.println("setLength length: " + sb.length()); // length of the string after calling setLength
        System.out.println("setLength sb: " + sb);
    }
}
