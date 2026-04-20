package academy.devdojo.maratonajava.javacore.H_Heranca.test;

import academy.devdojo.maratonajava.javacore.H_Heranca.domain.Funcionario;

public class HerancaTest02 {

    /* *
     * 0 - Bloco de inicialização estático da super classe é executado quadno a JVM carrega a classe pai
     * 1 - Bloco de inicialização estático da sub classe é executado quadno a JVM carrega a classe filha
     * 2 - Alocado espaço de memória para o objeto da superclasse
     * 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que foi passado
     * 4 - Bloco de inicialização da superclasse é executado na ordem que é implementado
     * 5 - Construtor é executado da superclasse
     * 6 - Alocado espaço de memória para o objeto da subclasse
     * 7 - Cada atributo de subclasse  é criado e inicializado com valores default ou o que foi passado
     * 8 - Bloco de inicialização da subclasse é executado na ordem que é implementado
     * 9 - Construtor é executado da subclasse
     * */

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João");

    }

}
