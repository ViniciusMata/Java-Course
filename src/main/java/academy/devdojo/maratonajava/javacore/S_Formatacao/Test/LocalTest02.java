package academy.devdojo.maratonajava.javacore.S_Formatacao.Test;

import java.util.Locale;

public class LocalTest02 {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        String[] isoConuntries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println();
        for (String isoConuntry : isoConuntries) {
            System.out.print(isoConuntry + " ");
        }


    }

}
