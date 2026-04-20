package academy.devdojo.maratonajava.introducao;

public class Aula04_Operadores {

    public static void main(String[] args) {

        // + - / *
        System.out.println("");
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // % resto de uma divisão
        System.out.println("");
        int resto = 21 % 7;
        System.out.println(resto);

        // operador condicional (( <   >   <=   >=   ==   !=  ))
        System.out.println("");
        boolean compara1 = 10 > 20;
        System.out.println(compara1);

        boolean compara2 = 10 < 20;
        System.out.println(compara2);

        boolean compara3 = 10 == 20;
        System.out.println(compara3);

        boolean compara4 = 10 >= 20;
        System.out.println(compara4);

        boolean compara5 = 10 <= 20;
        System.out.println(compara5);

        boolean compara6 = 10 != 20;
        System.out.println(compara6);

        // operador lógico (( AND && ))
        System.out.println("");
        int idade = 29;
        float salario = 3500;
        boolean maiorIdade1 = idade > 30 && salario >= 4612;
        boolean maiorIdade2 = idade < 30 && salario >= 3381;
        System.out.println(maiorIdade1);
        System.out.println(maiorIdade2);

        // operador logico (( OR || ))
        System.out.println("");
        double saldoCC = 200;
        double saldoCP = 10000;
        float presente = 5000;
        boolean comprar = saldoCC > presente || saldoCP > presente;
        System.out.println(comprar);

        // operador de atribuição =   +=   -=   *=   /=   %=
        System.out.println("");
        double bonus = 5500;
        bonus += 1000;
        System.out.println(bonus);

        bonus -= 1000;
        System.out.println(bonus);

        bonus *= 2;
        System.out.println(bonus);

        bonus /= 2;
        System.out.println(bonus);

        bonus %= 2;
        System.out.println(bonus);

        // atribuição
        System.out.println("");
        int contador = 5;
        contador += 1;
        contador -= 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

    }

}
