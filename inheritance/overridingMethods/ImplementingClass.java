package inheritance.overridingMethods;

import java.io.IOException;

public class ImplementingClass implements MyInterfaceWithAbstractMethod {

    // changed Exception type
    /*
    @Override
    public int method() throws IOException {
        return 0;
    }

    @Override
    public int method() throws Exception {
        return 0;
    }

    @Override
    public int method() {

    }
    */

    @Override
    public int method() throws IOException {
        return 23;
    }

}
