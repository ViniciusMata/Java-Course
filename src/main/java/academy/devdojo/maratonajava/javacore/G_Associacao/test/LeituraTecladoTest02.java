package academy.devdojo.maratonajava.javacore.G_Associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("O software que prevê o seu futuro !!!");
        System.out.println("Digite sua pergunta e eu responderei Sim ou Não");

        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

    }

}
