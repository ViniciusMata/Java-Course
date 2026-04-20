package academy.devdojo.maratonajava.javacore.Q_String.test;

public class StringBuilderTest01 {

    public static void main(String[] args) {

        String nome = "Vinicius Mata";
        nome.concat(" Estudando Java");
        nome = nome.substring(0, 3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Vinicius Mata"); // Todos metodos abaixo funcionam tbm para StringBuffer
        sb.append(" Estudando").append(" Java"); // .append = concatena
        sb.reverse(); // .reverse = inverte a String de tras para frente
        sb.delete(0, 3); // .delete = remove os caracteres conforme parametro passado
        System.out.println(sb);

    }

}
