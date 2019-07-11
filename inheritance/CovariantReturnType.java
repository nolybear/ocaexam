package inheritance;

import beans.Cat;
import beans.Dog;
import beans.Mammal;

public class CovariantReturnType {




    public class ParentClass {

        public Mammal animal() {
            return new Mammal();
        }

        public Cat getCat() {
            return new Cat();
        }

    }

    public class ChildClass extends ParentClass{

        /**
         * Dog is a subclass of Animal (see ParentClass.animal()), it is a covariant return type
         * ie different from method it overrides but subclass of the overridden return type
         */
        @Override
        public Dog animal() {
            return new Dog();
        }

        /**
         * Does not compile.
         * Method name and @Override say this overrides getCat() in ParentClass,
         *  however String is not a subclass of Cat, so we get a compile error
         *
        @Override
        public String getCat() {
            return "";
        }
        */

    }
}
