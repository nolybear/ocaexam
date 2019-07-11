package exceptions;

import java.io.IOException;

public class CatchUnthrown {
    public static void main(String[] args) {
        try {
            doThing();
            // wont compile - trying to catch a checked exception which has not been declared as thrown by doThing()
        // } catch(IOException e) { // wont compile
        } catch(NullPointerException e) {
            // NPE is a runtime Exception which can be thrown without being declared as such
            //  so this catch may be useful and is permitted by the compiler
        }
    }

    private static void doThing() {
        System.out.println("thing");
    }
}
