package academy.devdojo.maratonajava.javacore.Q_String.test;

public class StringPerformanceTest01 {

    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("ConcatString");
        long inicio = System.currentTimeMillis();
        concatString(1_000_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");

        System.out.println("-------------------");
        System.out.println("ConcatStringBuilder");
        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");

        System.out.println("-------------------");
        System.out.println("ConcatStringBuffer");
        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms");
    }

    public static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

}