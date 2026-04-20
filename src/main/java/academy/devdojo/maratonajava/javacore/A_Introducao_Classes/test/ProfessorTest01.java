package academy.devdojo.maratonajava.javacore.A_Introducao_Classes.test;

import academy.devdojo.maratonajava.javacore.A_Introducao_Classes.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Antonio";
        professor.idade = 40;
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("Sexo: " + professor.sexo);
    }
}
