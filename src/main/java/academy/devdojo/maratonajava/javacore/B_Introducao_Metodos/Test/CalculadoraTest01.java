package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.Test;

import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora com resultado fixado no método");
        // obtem o resultado consoante o que foi "fixado" no método ( sem parametro )
        calculadora.somar1();
        calculadora.subtrair1();
        calculadora.multiplicar1();
        calculadora.dividir1();
        System.out.println("\n");

    }
}
