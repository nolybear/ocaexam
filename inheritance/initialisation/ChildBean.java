
package inheritance.initialisation;

public class ChildBean extends ParentBean {

    {
        System.out.println("ChildBean anon block");
    }

    static {
        System.out.println("ChildBean static anon block");
    }

    public ChildBean() {
        System.out.println("ChildBean constructor");
    }
}
