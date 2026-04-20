package academy.devdojo.maratonajava.javacore.N_Polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.N_Polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.N_Polimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {

        double imposto = produto.calcularImposto();
        System.out.println("Relatório de imposto");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor R$ " + produto.getValor());
        System.out.println("Imposto a ser pago R$ " + imposto);

        if (produto instanceof Tomate) {
            String dataValida = ((Tomate) produto).getDataValidade();
            System.out.println("Validade: " + dataValida);
        }

    }

}
