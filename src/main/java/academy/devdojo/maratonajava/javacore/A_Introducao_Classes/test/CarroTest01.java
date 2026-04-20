package academy.devdojo.maratonajava.javacore.A_Introducao_Classes.test;

import academy.devdojo.maratonajava.javacore.A_Introducao_Classes.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "BMW";
        carro1.modelo = "320d";
        carro1.ano = 2005;

        carro2.marca = "Renault";
        carro2.modelo = "Megane Scenic";
        carro2.ano = 1998;

        // Referência de objeto
        //carro1 = carro2;
        //carro2 = carro1;

        System.out.println("Carro 1");
        System.out.println(carro1.marca);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.marca);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }

}
