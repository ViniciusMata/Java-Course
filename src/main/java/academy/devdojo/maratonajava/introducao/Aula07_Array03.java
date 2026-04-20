package academy.devdojo.maratonajava.introducao;

public class Aula07_Array03 {
    public static void main(String[] args) {

        // Formas de iniciar o array
        int[] numeros1 = new int[5];
        numeros1[0] = 1;
        numeros1[1] = 2;
        numeros1[2] = 3;
        numeros1[3] = 4;
        numeros1[4] = 5;

        // Formas de iniciar o array
        int[] numeros2 = {10, 20, 30, 40, 50};

        // Formas de iniciar o array
        int[] numeros3 = new int[]{100, 200, 300, 400, 500};

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

    }
}
