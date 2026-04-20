package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.Test;

import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.Calculadora;

public class CalculadoraTest05 {
    static void main(String... args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        //Formas de chamar o VarArgs
        calculadora.somaVarArgs1(numeros);
        calculadora.somaVarArgs2(1, 9, 8, 7, 6, 5);

    }

}
