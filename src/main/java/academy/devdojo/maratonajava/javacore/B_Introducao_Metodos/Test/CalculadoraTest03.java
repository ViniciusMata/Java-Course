package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.Test;

import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora com resultado enviado no método");
        // obtem o resultado consoante o que foi enviado no método ( com argumentos )
        int resultado1 = calculadora.somar3(30, 2);
        System.out.println(resultado1);
        int resultado2 = calculadora.subtrair3(30, 2);
        System.out.println(resultado2);
        int resultado3 = calculadora.multiplicar3(30, 2);
        System.out.println(resultado3);
        int resultado4 = calculadora.dividir3(30, 0);
        System.out.println(resultado4);

        calculadora.imprimirDividir4(30, 0);

    }
}
