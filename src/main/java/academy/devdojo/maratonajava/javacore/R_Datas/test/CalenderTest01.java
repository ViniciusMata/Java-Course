package academy.devdojo.maratonajava.javacore.R_Datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest01 {

    public static void main(String[] args) {

        // 2º classe criada pelo Java para consertar a Date
        Calendar c = Calendar.getInstance();
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2); //adicionar 2 dias ao horario
        c.add(Calendar.HOUR, 2); //adicionar 2 horas ao horario, aqui avanca o dia/hora

        c.roll(Calendar.HOUR, 2); //adicionar 2 horas ao horario, aqui nao avanca o dia/hora

        Date date = c.getTime();
        System.out.println(date);

    }

}
