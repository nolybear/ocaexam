package statics;

/**
 * Created by Ben on 11/07/2017.
 */
public class ExecutionOrder {

    static int y = 10;

    // assignment when an instance is created, the static stuff will already have executed by now
    //  as such x is assign 15 that was assigned to y by the static block at bottom of this file
    int x = y;

    public static void main(String[] args) {
        System.out.println(new ExecutionOrder().x);
        System.out.println(y);
    }

    // executed after y is set to 10 when class is loaded
    static { y = 15; }
}
