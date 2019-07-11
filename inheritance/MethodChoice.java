package inheritance;

import beans.Animal;
import beans.Mammal;
import beans.Cat;
import beans.Dog;

// which methods will be used when inheriting
public class MethodChoice {

    public static void main(String[] args) {
        MethodChoice choice = new MethodChoice();
        choice.callReferenceMethod();
        choice.useObjectMethod();
        choice.override();
    }

    void override() {
        Dog dog = new Dog();
        Animal animal = dog;

        // both dog and animal point to the same object (created with Dog())
        //  Dog.noise() overrides Animal.noise() as such the Dog method is called rather than Animal method
        System.out.println("dog.noise(): " + dog.noise());
        System.out.println("animal.noise(): " + animal.noise());
    }

    void callReferenceMethod() {

        Mammal mammal1 = new Mammal();
        Mammal mammal2 = new Cat();
        Mammal mammal3 = new Dog();

        Animal animal1 = new Mammal();
        Animal animal2 = new Cat();
        Animal animal3 = new Dog();


        // Output when using class reference type
        // output from instance type, not reference type
        System.out.println("m1: " + mammal1.noise());
        System.out.println("m2: " + mammal2.noise());
        System.out.println("m3: " + mammal3.noise());

        // Output when using interface reference type
        // output from instance type, not reference type
        System.out.println("a1: " + animal1.noise());
        System.out.println("a2: " + animal2.noise());
        System.out.println("a3: " + animal3.noise());
    }

    void useObjectMethod() {
        Mammal m = new Dog();

        // compiler error, the object is of type Dog, but the reference is Mammal so bark() method not available
//        m.bark();

        // cast to Dog, knowing that is what the underlying object is, now we can use bark()
        if(m instanceof Dog) {
            Dog d = (Dog) m;
            d.bark();
        }

        //  As the object pointed at by m is actually an instance of Dog, this cast would fail
        //  Mammal could just as well have been created as Cat(), in which case this cast be ok
//        Cat c = (Cat) m;

    }

}
