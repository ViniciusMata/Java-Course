package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais06 {
    public static void main(String[] args) {
        // utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // considerando 1 como domingo e 7 sabado

        int dia = 8;
        switch (dia) {
            case 1, 7:
                System.out.println("Final de Semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Inválido");
        }

    }
}
