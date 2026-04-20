package academy.devdojo.maratonajava.javacore.G_Associacao.test;

import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {

        Professor professor1 = new Professor("João Silva");
        Professor professor2 = new Professor("Maria Alves");
        Professor professor3 = new Professor("Pedro Souza");
        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Maria Leoni", professores);

        escola.imprime();

    }

}
