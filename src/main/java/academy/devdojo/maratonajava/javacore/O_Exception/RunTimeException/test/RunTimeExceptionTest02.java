package academy.devdojo.maratonajava.javacore.O_Exception.RunTimeException.test;

public class RunTimeExceptionTest02 {

    public static void main(String[] args) {
        divisao(1, 0);
        System.out.println("Código finalizado");
    }

    /**
     * @param a inteiro
     * @param b não pode ser 0 (zero)
     * @return resultado da divisao
     * @throws IllegalArgumentException caso b seja 0 (zero)
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0 (zero)");
        }
        return a / b;
    }

}
