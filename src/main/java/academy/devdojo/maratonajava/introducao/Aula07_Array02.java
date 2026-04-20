package academy.devdojo.maratonajava.introducao;

public class Aula07_Array02 {
    public static void main(String[] args) {

        //byte, short, int, long, float e double = 0
        //char '\0000'
        //boolean false
        //String null

        int [] idade =  new int[3];
        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);

        char [] sexo =  new char[3];
        System.out.println(sexo[0]);
        System.out.println(sexo[1]);
        System.out.println(sexo[2]);

        boolean [] verdade =  new boolean[3];
        System.out.println(verdade[0]);
        System.out.println(verdade[1]);
        System.out.println(verdade[2]);

        String [] nome =  new String[3];
        nome[0] = "Maria";
        nome[1] = "Ana";
        nome[2] = "Silvana";

        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);
        }
    }
}
