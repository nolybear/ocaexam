package variables;

public class Naming {
    // must start with letter, _ or $
    int _myVar = 1;
    int myVar = 2;
    int $myVar = 3;

    // _ in var name is ok
    int gfg_sg = 34;

    // illegal to start var name with number
    // int 23df = 324;

    static void legalVariableNaming() {
        // must start with letter, _ or $
        int myVar = 24;
        int myOtherVar = 243;

        int _myVar = 24;
        int _myOtherVar = 243;

        int $ = 0;
        int $dfb = 1245;
        int $123 = 2;

        // illegal
        // cant start with a number
        //int 123 = 23;
        //int 1sdg = 23;
    }

}
