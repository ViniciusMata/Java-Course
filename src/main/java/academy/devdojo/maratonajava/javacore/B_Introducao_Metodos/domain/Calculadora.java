package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain;

public class Calculadora {

    // void não retorna nada
    public void somar1() {
        System.out.println(10 + 2);
    }

    // void não retorna nada
    public void subtrair1() {
        System.out.println(10 - 2);
    }

    // void não retorna nada
    public void multiplicar1() {
        System.out.println(10 * 2);
    }

    // void não retorna nada
    public void dividir1() {
        System.out.println(10 / 2);
    }

    // void não retorna mesmo com parametro
    public void somar2(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    // void não retorna mesmo com parametro
    public void subtrair2(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    // void não retorna mesmo com parametro
    public void multiplicar2(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    // void não retorna mesmo com parametro
    public void dividir2(int num1, int num2) {
        if (num2 == 0) {
            System.out.println(0);
        }
        System.out.println(num1 / num2);
    }

    // método com return
    public int somar3(int num1, int num2) {
        return num1 + num2;
    }

    // método com return
    public int subtrair3(int num1, int num2) {
        return num1 - num2;
    }

    // método com return
    public int multiplicar3(int num1, int num2) {
        return num1 * num2;
    }

    // método com return
    public int dividir3(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    // void não retorna nada
    public void imprimirDividir4(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por ZERO");
            return;
        }
        System.out.println(10 / 2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    // sempre o vargas presica ser o ultimo no parameto
    public void somaVarArgs1(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    // sempre o vargas presica ser o ultimo no parameto
    public void somaVarArgs2(int valor, int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
