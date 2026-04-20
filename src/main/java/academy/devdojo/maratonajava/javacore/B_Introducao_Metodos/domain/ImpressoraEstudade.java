package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain;

public class ImpressoraEstudade {
    public void imprime(Estudante estudante){

        System.out.println("========================");
        estudante.nome = "Julia";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
