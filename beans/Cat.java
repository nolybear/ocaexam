package beans;

public class Cat extends Mammal {
    // override annotation is optional, but good for readability
    @Override
    public String noise() {
        return "Meow";
    }

    public void meow() {
        System.out.println(noise());
    }
}
