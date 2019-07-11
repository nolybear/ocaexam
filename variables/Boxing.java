package variables;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Boxing {

    @Test
    public void int127WrappersNotSame() {
        Integer int1 = new Integer(127);
        Integer int2 = new Integer(127);
        // Integers created using new, so treated different objects
        assert int1 != int2;
//        assertFalse(int1 == int2);
    }

    @Test
    public void int127WrappersSame() {
        Integer int1 = 127;
        Integer int2 = 127;
        // Integers created using primitive types/autoboxing
        //  numbers -128 - 127 are cached by Integer, autoboxing effectively returns Integer.valueOf(n)
        //  so we are comparing 2 primitive types, so == is true

        assertTrue(int1 == int2);
    }



    @Test
    public void int128WrappersNotSameObjects() {
        Integer int1 = new Integer(128);
        Integer int2 = new Integer(128);
        assertFalse(int1 == int2);
    }


    @Test
    public void whizLabsTest() {
        Integer a = new Integer(127);
        Integer b = new Integer(127);
        System.out.println(a == b); // false - different objects

        Integer c =127;
        Integer d =127;
        System.out.println(c == d); // true -

        Integer e = new Integer(200);
        Integer f = new Integer(200);
        System.out.println(e == f); //false

        Integer g = 200;
        Integer h = 200;
        System.out.println(g == h); //false


    }
}
