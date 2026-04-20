package academy.devdojo.maratonajava.javacore.J_Modificador_Final.test;

import academy.devdojo.maratonajava.javacore.J_Modificador_Final.domain.Carro;
import academy.devdojo.maratonajava.javacore.J_Modificador_Final.domain.Comprador;
import academy.devdojo.maratonajava.javacore.J_Modificador_Final.domain.Ferrari;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Comprador comprador = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Vinicius");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setMarca("Ferrari Puro Sangue");
        ferrari.imprime();

    }

}
