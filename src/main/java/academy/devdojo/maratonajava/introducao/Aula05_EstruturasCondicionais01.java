package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean comprarBebida = idade >= 18;

        if (comprarBebida) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Nao Autorizado");
        }

    }
}
