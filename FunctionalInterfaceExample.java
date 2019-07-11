// rules for functional interfaces:
//  - functional interface should have only one abstract method
//  - optional to include default or static method
//  - optional to have @FunctionalInterface annotation - but helps in IDEs/compilers

@FunctionalInterface
public interface FunctionalInterfaceExample {

    // abstract method, requires implementation by implementing class
    void doAbstractThing();

    // Can't have more than one abstract method and still be a @FunctionalInterface
    //      uncommenting this method will cause compiler to complain as no longer adheres
    //      to functional interface and we have added that annotation
    // public void doOtherAbstractThing();

    // may have default methods and still be a Functional Interface
    default boolean thing(){
        System.out.println("do something");
        return true;
    }

    // can have more than one default method and still be a @FunctionalInterface
    default void someDefaultThing() {
        System.out.println("do default thing");
    }
}