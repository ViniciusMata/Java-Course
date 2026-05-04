package academy.devdojo.maratonajava.javacore.R_Datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        //LocalDate date = LocalDate.of(2022, Month.JANUARY, 1);
        LocalDate date = LocalDate.parse("2022-01-01");
        //LocalTime time = LocalTime.of(9, 45, 12);
        LocalTime time = LocalTime.parse("09:45:12");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);

        System.out.println(ldt1);
        System.out.println(ldt2);

    }

}