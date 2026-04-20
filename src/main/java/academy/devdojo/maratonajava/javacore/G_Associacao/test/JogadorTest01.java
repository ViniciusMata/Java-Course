package academy.devdojo.maratonajava.javacore.G_Associacao.test;

import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Ronaldo R9");
        Jogador jogador2 = new Jogador("Ronaldinho R10");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }

}
