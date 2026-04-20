package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais04 {
    public static void main(String[] args) {
        /*
         * 0€        -   34.712  -   9.70%
         * 34.713€   -   68.507  -   37.35%
         * 68.508€   -           -   49.50%
         */
        double salarioAnual = 68508;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.5 / 100;
        double valorImposto;
        String faixa;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
            faixa = "primeiraFaixa";
        } else if (salarioAnual < 68508) {
            valorImposto = salarioAnual * segundaFaixa;
            faixa = "segundaFaixa";
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
            faixa = "terceiraFaixa";
        }

        System.out.println(valorImposto + " " + faixa);

    }
}
