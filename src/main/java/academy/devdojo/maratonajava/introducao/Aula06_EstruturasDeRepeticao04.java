package academy.devdojo.maratonajava.introducao;

import java.text.DecimalFormat;

public class Aula06_EstruturasDeRepeticao04 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            if (valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$ " + df.format(valorParcela));
            }
        }
    }
}
