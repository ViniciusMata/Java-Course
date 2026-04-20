package academy.devdojo.maratonajava.javacore.N_Polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.N_Polimorfismo.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void Salvar() {
        System.out.println("Salvando no arquivo");
    }

}
