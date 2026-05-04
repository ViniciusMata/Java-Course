package academy.devdojo.maratonajava.javacore.S_Formatacao.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {

        String pattern = "'Portugal' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("Portugal 04 de maio de 2026"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
