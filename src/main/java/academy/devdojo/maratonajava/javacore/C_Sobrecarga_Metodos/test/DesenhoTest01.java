package academy.devdojo.maratonajava.javacore.C_Sobrecarga_Metodos.test;

import academy.devdojo.maratonajava.javacore.C_Sobrecarga_Metodos.domain.Desenho;

public class DesenhoTest01 {
    public static void main(String[] args) {

        Desenho desenho =  new Desenho();
        desenho.init("Tom & Jerry", "TV", 150, "Animação");
        desenho.imprime();

    }
}
