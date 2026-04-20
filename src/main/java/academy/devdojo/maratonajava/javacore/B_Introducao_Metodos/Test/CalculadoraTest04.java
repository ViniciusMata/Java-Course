package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.Test;

import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;

        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro da CalculadoraTest04");
        System.out.println("Num1 " + num1);
        System.out.println("Num1 " + num2);

    }
}
