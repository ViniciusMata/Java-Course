package academy.devdojo.maratonajava.javacore.O_Exception.RunTimeException.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao1();
        abreConexao2();
    }

    private static String abreConexao1() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // esse bloco sempre será executado independente se houve sucesso ou insucesso
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("-----------------------------");
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }  finally { // esse bloco sempre será executado independente se houve sucesso ou insucesso
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }

}