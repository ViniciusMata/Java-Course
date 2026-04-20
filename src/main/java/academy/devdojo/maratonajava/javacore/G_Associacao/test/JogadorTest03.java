package academy.devdojo.maratonajava.javacore.G_Associacao.test;

import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Time;

public class JogadorTest03 {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Ronaldo R9");
        Jogador jogador3 = new Jogador("Ronaldinho R10");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        Time time = new Time("Brasil");

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----- Jogador -----");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();

        System.out.println("----- Time -----");
        time.imprime();

    }
}
