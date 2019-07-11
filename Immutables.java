/**
  */
public class Immutables {

    public static void main(String[] args) {
        notAssigningToVar();
    }

    private static void notAssigningToVar() {
        String s = "thing";
        s.concat(" other thing");

        // outputs "thing" not "thing other thing"
        // s.concat returns a new string, original string is not altered
        System.out.println(s);

        String s2 = s.concat(" other thing");
        // not we have assigned the new string to a var, we can print contatenated string
        System.out.println(s2);
    }
}
