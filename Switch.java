/**
 Switch more efficient than nested ifs
 */
public class Switch {

    public static void main(String[] args) {
        legalSwitchVarTypes();
        switchWithoutDefault();
        switchWithInts();
        switchWithArray();
        switchWithDoubles();
    }

    private static void legalSwitchVarTypes() {

        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 23f;
        double d = 34.23;
        char c = 12;
        String str = "abc";


        switch (b) {
            default:
                System.out.println("byte ok");
        }
        switch (c) {
            default:
                System.out.println("char ok");
        }
        switch (s) {
            default:
                System.out.println("short ok");
        }
        switch (i) {
            default:
                System.out.println("int ok");
        }
//        switch (l) {
//            default:
//                System.out.println("long ok");
//        }
//        switch (f) {
//            default:
//                System.out.println("float ok");}
//        switch (d) {
//            default:
//                System.out.println("double ok");
//        }
        switch (str) {
            default:
                System.out.println("String ok");
        }

    }

    private static void switchWithoutDefault() {
        int y = 5;
        switch(y) {
            case 123: {
                //do stuff
            }
            case 2353: {
                // do stuff
            }

            // default case is not required to compile
        }
        System.out.println("switchWithoutDefault completed");
    }

    private static void switchWithDoubles() {
        double value = Math.random() * 3;
//      switch (value) { // compile error - can;t use double in switch
//        case 1:
//        case 2:
//
//      }
    }

    private static void switchWithArray() {
        final int[] array = {1,2,3};

        switch(2) {

            /**
             * Can't use array[x] here because the value cannot be determined until runtime
             * ie it is not a compile time constant
             */
            case 1: // case array[0]
                System.out.println("1");
                break;
            case 2: // case array[1]
                System.out.println("2");
                break;
            default:
                System.out.println("do something");
        }
    }


    private static void switchWithInts() {
        final int y = 2;
        final int x = -1;
//        int x = -1; // constant expression required
//        int x = 1;
//        final int x = 1; // end up with duplicate cases in switch (y==2, x+1==2)


        switch (x+y) {
            case x+1    :
                { System.out.println(); }
            case 1      :
                System.out.println("B");
            default     :
                System.out.println("default");
                break;
            case y      :
                System.out.println("C");
        }
    }
}
