package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.Test;

import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Maria";
        estudante1.idade = 15;
        estudante1.sexo = 'F';

        estudante2.nome = "João";
        estudante2.idade = 14;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();

    }
}
