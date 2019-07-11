package variables.scope;
public class StaticVsLocal {
    static int x = 4;

    public static void main(String[] args) {
        int x = 10;

        // local variable x used rather than the static
        System.out.println(x);

        // static value used
        System.out.println(StaticVsLocal.x);
    }
}