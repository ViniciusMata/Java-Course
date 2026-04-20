package academy.devdojo.maratonajava.javacore.D_Construtores.test;

import academy.devdojo.maratonajava.javacore.D_Construtores.domain.Desenho;

public class DesenhoTest01 {
    public static void main(String[] args) {

        Desenho desenho =  new Desenho("Tom & Jerry", "TV", 150, "Animação", "Turner Entertainment");
        desenho.imprime();

    }
}
