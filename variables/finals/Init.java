package variables.finals;

public class Init {

    // without one of options below being uncommented, this will not compile as i is not initialised.
     final int i;

    // i is defined as final so must be initialised either:

    // class constant
    //  final int i = 0;

    // initialiser block
    // { i = 3 }

    // or in the constructor
    public Init() {
        i = 5;
    }

    public static void main(String[] args) {
        Init init = new Init();
        System.out.println(init.i);
    }
}
