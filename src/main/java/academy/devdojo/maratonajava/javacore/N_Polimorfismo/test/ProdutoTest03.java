package academy.devdojo.maratonajava.javacore.N_Polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_Polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.N_Polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.N_Polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.N_Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);

        tomate.setDataValidade("01/12/2026");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------");
        CalculadoraImposto.calcularImposto(produto);

    }

}
