package academy.devdojo.maratonajava.javacore.Q_String.test;

public class StringTest02 {

    public static void main(String[] args) {

        String nome = "     Vinicius    Lourenço    da  Mata   ";
        String numero = "0123456789";
        System.out.println(nome.charAt(0)); // Retorna o conteudo da string conforme indice passado do array da string
        System.out.println(nome.length()); // Retorna o tamanho da string
        System.out.println(nome.replace("s", "ç")); // Substitui algo na string
        System.out.println(nome.toLowerCase()); // Torna tudo minusculo
        System.out.println(nome.toUpperCase()); // Torna tudo MAISCULO
        System.out.println(numero.substring(0,2)); // Retorna a string entre o intervalo passado no parametro
        System.out.println(nome.trim()); // Remover espaço no começo e final da string

    }

}
