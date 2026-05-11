package academy.devdojo.maratonajava.javacore.R_Datas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {

    public static void main(String[] args) {

        LocalDateTime aniversario = LocalDateTime.of(1994, Month.JANUARY, 18, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
        System.out.println(ChronoUnit.DECADES.between(aniversario, now));
        System.out.println(ChronoUnit.CENTURIES.between(aniversario, now));
        System.out.println(ChronoUnit.MILLENNIA.between(aniversario, now));
        System.out.println(ChronoUnit.ERAS.between(aniversario, now));

    }

}
