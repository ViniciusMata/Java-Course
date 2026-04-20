package academy.devdojo.maratonajava.javacore.G_Associacao.test;

import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.G_Associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Santos");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
