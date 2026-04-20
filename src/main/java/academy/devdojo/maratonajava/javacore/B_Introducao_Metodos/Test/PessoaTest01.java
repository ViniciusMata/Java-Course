package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.Test;

import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Vinícius");
        pessoa.setIdade(32);

        //pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
