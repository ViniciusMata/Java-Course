package academy.devdojo.maratonajava.javacore.N_Polimorfismo.test;

import academy.devdojo.maratonajava.javacore.N_Polimorfismo.repository.Repositorio;
import academy.devdojo.maratonajava.javacore.N_Polimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {

    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioMemoria();
        repositorio.Salvar();

    }

}
