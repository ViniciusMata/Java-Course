package academy.devdojo.maratonajava.javacore.F_Modificador_Estatico.test;

import academy.devdojo.maratonajava.javacore.F_Modificador_Estatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes-Benz", 290);
        Carro carro3 = new Carro("Porsche", 300);

        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
