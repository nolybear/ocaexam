package statics;

public class Constructors {
    static int i;
    int j;

    Constructors() {
        this.j = i++;
    }

    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors();
        Constructors c3 = new Constructors();

        // i is a class variable, it is incremented during each instance instantiation
        System.out.println("c1.i =: " + c1.i);

        // j is set to 0 in initialisation of c1.
        // Subsequent calls to constructor do not impact it as only set for that instance (and before the increment/++ operator has affect).
        System.out.println("c1.j =: " + c1.j);

    }
}
