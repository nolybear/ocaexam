package interfaces;

public interface MyInterface {

    // static declaration here not actually required
    static int x = 7;

    // defaults to static
    int y = 8;

    // public modifier implicit, not actually required here
    public default int intMethod() {
        return 5;
    }

    // abstract not required here,
    // no default or static modifier so has to be abstract
    abstract int intMethod2();

    public static int intMethod3() { return 8; };
    // implicitly public
    static int intMethod4() { return 4; }

    public void method();

//    default static void thing() {}
}
