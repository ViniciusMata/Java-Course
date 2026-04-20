package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.Test;

import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora com resultado enviado no método");
        // obtem o resultado consoante o que foi enviado no método ( com argumentos )
        calculadora.somar2(20, 2);
        calculadora.subtrair2(20, 2);
        calculadora.multiplicar2(20, 2);
        calculadora.dividir2(20, 2);

    }
}
