package exceptions;

public class ExceptionConstruction {

    public static void main(String[] args) {
        fiveConstructorsOfException();
    }

    private static void fiveConstructorsOfException() {
        Throwable cause = new Exception();
        String message = "a message";
        boolean enableSuppression = true;
        boolean writableStackTrace = true;

        new Exception();
        new Exception(message);
        new Exception(cause);
        new Exception(message, cause);
//        new Exception(message, cause, enableSuppression, writableStackTrace);
    }

}
