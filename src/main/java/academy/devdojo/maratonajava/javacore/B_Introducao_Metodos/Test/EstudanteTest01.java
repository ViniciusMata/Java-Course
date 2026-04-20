package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.Test;

import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.Estudante;
import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.ImpressoraEstudade;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudade impressora = new ImpressoraEstudade();

        estudante1.nome = "Maria";
        estudante1.idade = 15;
        estudante1.sexo = 'F';

        estudante2.nome = "João";
        estudante2.idade = 14;
        estudante2.sexo = 'M';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

    }
}
