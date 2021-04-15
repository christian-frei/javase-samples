package date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import static java.time.temporal.TemporalAdjusters.next;

public class FirstFridayOfNextMonth {

    String getFirstFridayOfNextMonth() {
        var now = LocalDate.now().plusMonths(1);
        var firstFridayOfNextMonth = now.
                with(firstDayOfMonth()).
                with(next(DayOfWeek.FRIDAY));
        return DateTimeFormatter.ofPattern("d. MMMM yyyy").
                format(firstFridayOfNextMonth);
    }
}
