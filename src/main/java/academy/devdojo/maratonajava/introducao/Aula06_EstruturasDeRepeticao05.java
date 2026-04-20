package academy.devdojo.maratonajava.introducao;

import java.text.DecimalFormat;

public class Aula06_EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + df.format(valorParcela));
        }
    }
}
