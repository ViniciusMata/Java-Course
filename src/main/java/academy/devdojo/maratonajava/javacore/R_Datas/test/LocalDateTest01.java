package academy.devdojo.maratonajava.javacore.R_Datas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(1994, Month.JANUARY, 18);
        LocalDate agora = LocalDate.now();
        agora.plusWeeks(4);

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

    }

}
