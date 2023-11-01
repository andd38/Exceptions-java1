package Datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class date04 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastweekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);

        System.out.println(pastweekLocalDate);
        System.out.println(nextWeekLocalDate);

        LocalDateTime pastweekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime =d05.plusWeeks(1);

        System.out.println("pastweekLocalDateTime ->"+pastweekLocalDateTime);
        System.out.println("nextWeekLocalDateTime -> "+nextWeekLocalDateTime);

        Instant pastweekInstant = d06.minus(7,ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("pastweekInstant ->" +pastweekInstant);
        System.out.println("NextweekInstant ->" +nextWeekInstant);


        Duration t1 = Duration.between(pastweekLocalDateTime,d05);
        Duration t2 = Duration.between(pastweekLocalDate.atTime(0,0),d04.atTime(0,0));
        Duration t3= Duration.between(pastweekInstant , d06);
        System.out.println("t1 dias = "+ t1.toDays());
        System.out.println("t2 dias = "+ t2.toDays());
        System.out.println("t3 dias = "+ t3.toDays());
    }
}
