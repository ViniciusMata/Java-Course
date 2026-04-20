package academy.devdojo.maratonajava.introducao;

public class Aula08_ArrayMultidimensionais01 {
    public static void main(String[] args) {

        // array multidimensional a 1º base sempre precisa ser declarada o tamanho do array
        int[][] dias = new int[2][3];

        dias[0][0] = 10;
        dias[0][1] = 20;
        dias[0][2] = 30;

        dias[1][0] = 5;
        dias[1][1] = 10;
        dias[1][2] = 15;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("............................");

        for (int[] arrayBase : dias) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
