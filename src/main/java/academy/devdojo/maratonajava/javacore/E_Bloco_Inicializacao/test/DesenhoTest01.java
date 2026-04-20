package academy.devdojo.maratonajava.javacore.E_Bloco_Inicializacao.test;

import academy.devdojo.maratonajava.javacore.E_Bloco_Inicializacao.domain.Desenho;

public class DesenhoTest01 {
    public static void main(String[] args) {

        Desenho desenho = new Desenho("Tom e Jerry");
        for (int episodio : desenho.getEpisodios()){
            System.out.println(episodio);
        }

    }
}
