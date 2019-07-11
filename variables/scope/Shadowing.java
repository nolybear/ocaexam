package variables.scope;

public class Shadowing {

    private int value = 9;

    // doesn't actually change value of private int
    //  we actually reassign the parameter to itself because it shadows the instance var
    public void changeValue(int value) {
        value = value;
    }

    // does the assignment expected in a method called changeValue()
    //  explicitly call to this.value causes assignment to member var rather than param
    public void reallyChangeValue(int value) {
        this.value = value;
    }

    public int getInt() {
        return this.value;
    }

    public static void main(String[] args) {
        int aNumber = 2;
        Shadowing shadow = new Shadowing();

        shadow.changeValue(aNumber);
        System.out.format("shadow.number %s \n", shadow.getInt());

        shadow.reallyChangeValue(aNumber);
        System.out.format("shadow.number %s \n", shadow.getInt());
    }
}
