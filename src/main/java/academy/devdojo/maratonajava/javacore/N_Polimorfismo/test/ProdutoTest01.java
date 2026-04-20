package academy.devdojo.maratonajava.javacore.N_Polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_Polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.N_Polimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.N_Polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.N_Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao televisao = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(televisao);


    }

}
