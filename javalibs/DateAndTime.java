package javalibs;

import java.time.*;

public class DateAndTime {

    public static void main(String[] args) {
        constructWithValues();
        addPeriodToDate();
    }

    // Date / Time classes can be instantiated with .of(int...) method
    //  int params are values greatest to smallest as appropriate (eg year, month, day, hour, minutes, seconds) as appropriate
    //  can use enum values for some fields eg Month.FEBRUARY
    private static void constructWithValues() {
        LocalDate ld = LocalDate.of(2016, 2, 15);
        System.out.println("LocalDate.of(2016, 2, 15): " + ld);

        ld = LocalDate.of(2016, Month.FEBRUARY, 15);
        System.out.println("LocalDate.of(2016, Month.FEBRUARY, 15): " + ld);

        LocalDateTime ldt = LocalDateTime.of(2016, 2, 15, 11, 55);
        System.out.println("LocalDateTime.of(2016, 2, 15, 11, 55): " + ldt);

        System.out.println("LocalTime.of(12, 35): " + LocalTime.of(12, 35));
        System.out.println("LocalTime.of(12, 35, 55): " + LocalTime.of(12, 35, 55));
    }

    private static void addPeriodToDate() {
        LocalDate localDate = LocalDate.of(2015, 12, 15);
        Period p = Period.of(1,2,0);
        localDate.plus(p);

        // notice date hasn't changed - Date stuff immutable objects
        //  API returns new instance, not a modified one, so because we haven't assigned return value we see original value
        System.out.println("Period addition: " + localDate);

        localDate = localDate.plus(p);
        // notice here the output is now the modified date
        //  we reassigned the return value of .plus(Temporal) to original var
        System.out.println("Period addition: " + localDate);
    }
}
