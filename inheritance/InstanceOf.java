package inheritance;

import beans.Animal;
import beans.Mammal;
import beans.Dog;

public class InstanceOf {

    public static void main(String[] args) {
        Object obj = new Mammal();

        // Mammal implements the Animal interface so instanceOf == true
        if(obj instanceof Animal) {
            System.out.println("Object is instance of Animal interface");
        }

        // obj reference points to an object that was created as a Mammal, so instanceOf == true
        if(obj instanceof Mammal) {
            System.out.println("Object is instance of Mammal interface");
        }

        if(obj instanceof Dog) {
            System.out.println("Object is instance of Dog");
        } else {
            System.out.println("Object is not an instance of Dog");
        }
    }
}
