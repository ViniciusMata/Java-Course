package academy.devdojo.maratonajava.javacore.S_Formatacao.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumerFormatTest02 {

    public static void main(String[] args) {

        Locale localePT = new Locale("pt", "PT");
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(localePT);
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 100_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            int decimal = numberFormat.getMaximumFractionDigits();
            System.out.println(numberFormat.format(valor) + " -- Casas decimais " + decimal);
        }

        String valorString = "1,000";

        try {
            System.out.println(nfa[2].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}