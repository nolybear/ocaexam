package exceptions;

import java.io.IOException;

public class HandlingExceptions {
    static Integer i;

    public static void main(String[] args) {
        catchMultipleExceptions();
        usingFinallyWithoutCatch();
        usingFinallyWithCatch();
    }


    private static void catchMultipleExceptions() {
        try {
            System.out.println(i);

            // trying to catch 2 exceptions where one is subclass of another, error because NPE is a subclass of RTE
            //  NPE and AE are siblings in exception hierarchy, so ok
        } catch (NullPointerException | ArithmeticException e /* | RuntimeException e */ ) {
            e.printStackTrace();
        }
    }

    private static void usingFinallyWithoutCatch() {
        try {
            System.out.println("trying to do something that might go wrong");
        } finally { // legal - we don't have to have a catch before finally
            System.out.println("execute finally - perhaps close resources/do some other clean up that should always run");
        }

    }

    private static void reassignException() {
        try {
            System.out.println("doing stuff");
        } catch (NullPointerException | ArithmeticException e) {
            // this will not compile
            // when using multi-catch, e is implicitly final
            // trying to reassign a value to a final var
//            e = new NullPointerException("a new exception");
        }


        // here we can reassign Exception var because it isn't from a multi-catch statement
        try {
            System.out.println("doing stuff");
        } catch (NullPointerException e) {
            e = new NullPointerException("dsfd");
        } catch (ArithmeticException e) {
            e = new ArithmeticException("sfsfgfb");
        }
    }

    private static void usingFinallyWithCatch() {
        System.out.println("** usingFinallyWithCatch **");
        try {
            System.out.println("trying again");
        } catch(NullPointerException e) {
            // wont see this output because NPE is not thrown
            System.out.println("do something with caught exception");
        } finally {
            // this will run after the try or the catch block
            // if an uncaught exception is thrown, the finally will block will run before the exception is thrown up
            System.out.println("this will always run");
        }
    }

    /**
     * Because IOException cannot be thrown by the content of the try block, the compiler complains
     * The exception cannot be thrown, so compilation fails.
    private static void compileFailing() {
        try {
            System.out.println("this does not throw IOException");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     */
}
