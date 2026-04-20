package academy.devdojo.maratonajava.introducao;

public class Aula06_EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        System.out.println("While");
        int i = 0;
        while (i < 10) {
            System.out.println("Dentro do While " + i++);
        }
        System.out.println("");
        System.out.println("For");
        for (int j = 1; j < 10; j++) {
            System.out.println("Dentro do For " + j);
        }
        System.out.println("");
        System.out.println("Do While");
        int k = 0;
        do {
            System.out.println("Dentro do Do While " + k++);
        }   while (k < 10);

    }
}
