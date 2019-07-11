package beans;

import java.util.Optional;

public class Dog extends Mammal {

    String name = null;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {}

    // override annotation is optional, but good for readability
    @Override
    public String noise() {
        return "Bark";
    }

    public void bark() {
        System.out.println(noise());
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}
