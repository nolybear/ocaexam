import java.text.DecimalFormat;

public class Exp {
    public static void main(String[] args) {
        double value = 75.23;

        String result = new DecimalFormat("##.##").format(value);
        System.out.println("output: " + result);

        System.out.println();
    }
}
