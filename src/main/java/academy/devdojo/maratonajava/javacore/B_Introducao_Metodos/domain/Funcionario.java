package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain;

import java.text.DecimalFormat;

public class Funcionario {

    DecimalFormat df = new DecimalFormat("0.00");

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios == null) {
            return;
        }

        for (double salario : this.salarios) {
            System.out.println("Salário: R$ " + salario);
        }
        imprimeMedia();
    }

    public void imprimeMedia() {

        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }

        media /= salarios.length;
        System.out.println("Média salarial: R$ " + df.format(media));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
