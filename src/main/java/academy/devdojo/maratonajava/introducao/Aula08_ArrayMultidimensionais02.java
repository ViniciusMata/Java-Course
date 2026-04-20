package academy.devdojo.maratonajava.introducao;

public class Aula08_ArrayMultidimensionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        // Formas de iniciar o array multidimensional
        arrayInt[0] = new int[2];

        // Formas de iniciar o array multidimensional
        arrayInt[1] = new int[]{100, 200, 300, 400};

        // Formas de iniciar o array multidimensional **/**
        int[] array = {1000, 2000, 3000, 4000, 5000, 6000};
        arrayInt[2] = array;

        // Formas de iniciar o array multidimensional
        int[][] arrayInt2 = {{0, 0}, {100, 200, 300, 400}, {1000, 2000, 3000, 4000, 5000, 6000}};

        System.out.println("arrayInt1");
        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }

        System.out.println("");
        System.out.println("arrayInt2");
        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
