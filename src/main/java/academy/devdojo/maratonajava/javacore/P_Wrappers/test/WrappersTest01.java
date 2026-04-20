package academy.devdojo.maratonajava.javacore.P_Wrappers.test;

public class WrappersTest01 {

    public static void main(String[] args) {
        // Tipos primitivos nativos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1f;
        double doubleP = 1D;
        char charP = 'P';
        boolean booleanP = true;

        // Objetos da classe Wrapper
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW0 = 1;
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean booleanW = true;

        Integer intW1 = 1;   //boxing ou autoboxing
        int i = intW1;       //unboxing

        Integer intW2 = Integer.valueOf("1");

        // Transforma um String (texto) para outro tipo de dado.
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        // Verifica se o conteudo passado é numérico
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));

        // Verifica se é letra (letra ou letra com acentuação) OU numérico
        System.out.println(Character.isLetterOrDigit('!'));

        // Verifica se é MAIUSCULA
        System.out.println(Character.isUpperCase('A'));

        // Verifica se é minuscula
        System.out.println(Character.isLowerCase('a'));

        // Transforma em MAIUSCULA
        System.out.println(Character.toUpperCase('a'));

        // Transforma em minuscula
        System.out.println(Character.toLowerCase('A'));

    }

}