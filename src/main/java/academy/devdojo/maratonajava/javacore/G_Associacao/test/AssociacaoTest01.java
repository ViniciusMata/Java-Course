package academy.devdojo.maratonajava.javacore.G_Associacao.test;

import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Local;
import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Seminario;

public class AssociacaoTest01 {

    public static void main(String[] args) {

        Local local = new Local("Rua das Laranjeiras");

        Aluno aluno = new Aluno("João Santos Alves", 20);
        Professor professor = new Professor("Maria Antonieta Silva", "Matemática");

        Aluno[] alunosSeminario = {aluno};

        Seminario seminario = new Seminario("Matemática para Leigos", alunosSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }

}
