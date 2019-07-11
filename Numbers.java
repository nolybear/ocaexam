public class Numbers {

    public static void main(String[] args) {
        System.out.println("parseLong('123'): " + Long.parseLong("123"));

        // NumberFormatException "1.0" cannot be parsed to integer value
        //        System.out.println("parseLong('1.0'): " + Long.valueOf("1.0"));

        System.out.println(Integer.parseInt("011"));

        short s = 4;
        double d = 4;
        // comparison compiles ok..
        System.out.println(s == d);

        addingTypes();
        usingModulous();
        castingDoubleToInt();
        equality();
        downCasting();
        integerDivision();

    }

    private static void integerDivision() {
        int x = 10;
        int y = 3;
        int z = x / y;
        System.out.println("integerDivision z: " + z); // 3, the .33 is lost


        double x1 = 10.345;
        double y1 = 3;
        int z1 = x/y;
        System.out.println("integerDivision with doubles z: " + z); // 3, the .33 is lost

    /*
        int x2 = 10;
        int y2 = 0;
        int z2 = x2 / y2; // java.lang.ArithmeticException
        System.out.println("integerDivision /0 z: " + z2); // don't get to here because divide by zero failure above
        */
    }

    private static void downCasting() {
        int i = 150;
        System.out.println("downCasting i: " + i);
        byte b = (byte) i; // legal, but the result will lose accuracy
        System.out.println("downCasting b: " + b);
    }
    private static void addingTypes() {
        float f = 12;
        int i = 10;
        System.out.println(f+i);
    }

    private static void castingDoubleToInt() {
        double d = 12.7;
        int j = 12;
        int i = (int) d+j; // need cast?
        System.out.println("cast to int: " + i);
    }

    private static void usingModulous() {
        // result will have +/- sign of numerator (first number)
        System.out.println("-10 % -3: " + (-10 % -3));
        System.out.println("-10 % 3: " + (-10 % 3));
        System.out.println("10 % -3: " + (10 % -3));
        System.out.println("10 % 3: " + (10 % 3));
    }

    private static void equality() {
        Integer i = 10;
        Double d = 10.0;
        int ii = 10;
        double dd = 10.0;

        System.out.println(i.equals(d)); // comparing objects == false
        System.out.println(ii == dd); // comparing 10 to 10.0 primatives == true
    }
}
