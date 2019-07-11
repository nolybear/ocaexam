package javalibs;

import beans.Dog;

import java.util.Optional;

public class Optionals {
    static Long nonNullLong = 34L;

    public static void main(String[] args) {

        Optional<Long> optNotNull = getValueContainingOptional();
    System.out.println("not null: " + optNotNull.orElse(new Long(15)));

        Optional<Long> optNull = getNullContainingOptional();
        System.out.println("null: " + optNull.orElse(new Long(15)));

        // optional, if present put value in string, otherwise ""


    }

    public static Optional<Long> getNullContainingOptional() {
        return Optional.ofNullable(null);
    }

    public static Optional<Long> getValueContainingOptional() {
        return Optional.ofNullable(nonNullLong);
    }
}
