package inheritance.initialisation;

class ParentBean {

    {
        System.out.println("ParentBean anon block");
    }

    static {
        System.out.println("ParentBean static anon block");
    }

    public ParentBean() {
        System.out.println("ParentBean constructor");
    }
}
