package inheritance.initialisation;

public class Main {

    /*
    Illustrating the execution order of
    - static anon blocks (static {})
    - parent constructor
    - anon blocks/initialisers ( {} )
     */
    public static void main(String[] args) {
        new ChildBean();


        /*
        First, any static blocks are executed as classes are initialised:
        - static anon block in parent
        - static anon block in parent

        When instances are created:
        - parent anon block (actually gets copied into top of constructor)
        - parent constructor
        - child anon block (copied into child constructor)
        - child constructor
        - child constructor
         */
    }
}
