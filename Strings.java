import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class Strings {
    public static void main(String[] args) {

        printSubString();

        doJoin();

        String str1 = "abc";
        String str2 = "abc2";
        String str3 = " abc2 ";

        System.out.println("str3.trim():" + str3.trim());
        str1 = str3.trim();
        System.out.println("str3:"+str3);
        System.out.println("str1:" + str1);

        dateFormat();

        spliting();
    }

    private static void spliting() {
        String testString = "this is a long string containing multiple s characters ";
        String[] results = testString.split("\\s"); // split on 'space' not 's'
        System.out.format("results.length: %s", results.length);
        System.out.println(Arrays.asList(results));
    }

    private static void doJoin() {
        // String.join creates a new String by concatenating given char sequences, interspersed by the first param
        System.out.println(String.join("-","1","1")); // 1-1
        System.out.println(String.join("-","1","2", "3")); // 1-2-3
    }

    private static void printSubString() {
        // not substring index starts at 0
        String s = "abcdef";
        System.out.println(s.substring(0)); // prints from a
        System.out.println(s.substring(3)); // prints from d
    }

    private static void dateFormat() {
        //%[argument_index$][flags][width]conversion
//        System.out.format("%sHt :  ", new Date());
//        DateTimeFormatter.ofPattern();
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println("date BASIC_ISO: " + formatter.format(LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault()) ));

        // 19th Oct 2017
        DateTimeFormatter formatterWithPattern = DateTimeFormatter.ofPattern("d MMMM yyyy HH:mm");
        System.out.println("date PATTERN: " + formatterWithPattern.format(LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault()) ));
    }
}
