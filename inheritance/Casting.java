package inheritance;

import beans.Cat;
import beans.Dog;
import beans.Mammal;

public class Casting {

    public static void main (String ... args) {
        Casting c = new Casting();

        c.upCastPrimitive();
        c.downCastPrimitive();

        c.upCastObject();
        c.downCastObject();
    }

    public void upCastPrimitive() {
        // implicit upcast to int happening here
        // int has broader range of values so implicit upcasting can work
        short s = 5;
        int i = s;
    }

    public void downCastPrimitive() {
        // will not compile without the explicit cast to short
        //  narrowing range of values
        int i = 2;
        short s = (short) i;
    }

    public void upCastObject() {
        // Dog extends Mammal class, Mammal is higher in hierarchy so an implicit upcast happens
        Mammal m = new Dog();
    }

    public void downCastObject() {
        // Casting down the hierarchy (Mammal -> Dog) requires an explicit downcast
        Mammal m = new Dog();

        Dog d = (Dog) m;
        d.bark();
    }
}
