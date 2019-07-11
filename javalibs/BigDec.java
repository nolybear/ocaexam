package javalibs;

import java.math.BigDecimal;

public class BigDec {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal(2452362567777246546456625677.34);
        number1 = number1.scaleByPowerOfTen(4);
        System.out.format("number1.engineeringString: %s %n", number1.toEngineeringString());
        System.out.format("number1.plainString: %s %n", number1.toPlainString());
        System.out.format("number1.string: %s %n", number1.toString());

        System.out.format("number1.string: %s %n", number1.toBigInteger().toString());
    }
}
