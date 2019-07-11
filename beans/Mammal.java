package beans;

public class Mammal implements Animal {

    public Mammal() {}

    // override annotation is optional, but good for readability
    @Override
    public String noise() {
        return "None";
    }
}
