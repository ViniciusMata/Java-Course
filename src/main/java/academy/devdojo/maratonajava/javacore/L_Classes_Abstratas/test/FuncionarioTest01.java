package academy.devdojo.maratonajava.javacore.L_Classes_Abstratas.test;

import academy.devdojo.maratonajava.javacore.L_Classes_Abstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.L_Classes_Abstratas.domain.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Vinícius", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Stephanie", 12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();

    }

}
