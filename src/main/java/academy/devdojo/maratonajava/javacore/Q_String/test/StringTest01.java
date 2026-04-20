package academy.devdojo.maratonajava.javacore.Q_String.test;

public class StringTest01 {

    public static void main(String[] args) {

        String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        nome1 = nome1.concat(" Lourenco da Mata");
        System.out.println(nome1);
        System.out.println(nome1 == nome2);
        String nome3 = new String("Vinicius"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }

}
