package arrays;

public class Declarations {

    static int[] staticIntArr = new int[5];

    public static void main(String args[]) {
        int [][] array = {{0}, {0,1}};
//        System.out.println(array) [1][0]);

        new Declarations().nonInit();
        sizingWhenInit();
        negativeArraySize();
        initTooLateWithLiteral();
    }

    private void nonInit() {
        int[] intArr = new int[5];
        System.out.println("nonInit: " + intArr[4]);
        System.out.println("nonInit.static: " + Declarations.staticIntArr[2]);
    }

    private static void sizingWhenInit() {
        long arrSizeAsLong = 1;
        int arrSizeAsPrimitiveInt = 1;
        Integer arrSizeAsObjectInt = 1;

        // using a long to initialise array size will cause compiler error
        // can only use int
        //      int[] ints = new int[arrSizeAsLong];
        // type of array isn't a problem, just the value used to set size
        //      long[] longs = new long[arrSizeAsLong];

        // legal - using int
        int[] ints = new int[arrSizeAsPrimitiveInt];

        // legal - autoboxing deals with wrapper <-> primitive
        int[] ints2 = new int[arrSizeAsObjectInt];
    }

    private static void negativeArraySize() {
        try {
            int[] arr = new int[-1];
        } catch(NegativeArraySizeException e) {
            System.out.println("NegArrExc");
            throw new NegativeArraySizeException("thrown in code to show finally still happens");
        } finally {
            System.out.println("finally");
        }
    }

    private static void initTooLateWithLiteral() {

        // when using array literals, they can only be used when declaring the array
        // so this is illegal:
        /*
        int[] arr;
        arr = {1,2,3};
        */

        // this is ok because using with initialisation of var
        int[] arr = {1,2,3};

        // also ok because declaring new array...
        int[] arr2;
        arr2 = new int[] {12,12,12};
    }
}
