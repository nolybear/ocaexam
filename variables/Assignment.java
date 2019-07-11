package variables;

public class Assignment {
    public static void main(String[] args) {
        // compile fail - array init not allowed here
        // use 'new String[]'
//        args = {"1", "dfg"};
        args = new String[] {"1", "dfg"};

        int number = 4;
        String name = "blah";

        // wont compile, assigning number to String
//        String aStringOfASum = number + 1;

        // We have String and Number, adding them gets treated as String concatenation
        String namePlusNumber = name + number;
        System.out.println(namePlusNumber);

    }
}
