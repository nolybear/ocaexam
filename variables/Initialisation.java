package variables;

public class Initialisation {

    static int i;

    public static void main(String[] args) {
        Initialisation.failAsLocalVarNotInitialised();
        Initialisation.globalInitOk();
    }


    static void failAsLocalVarNotInitialised() {
        // If define (shadow) i, it must be initialised, or compilation fails
        // int i;
        System.out.println(i);
    }

    static void globalInitOk() {
        // note i hasn't been initialised in code
        //  it will use the default for it's type
        System.out.println(i);
    }
}
