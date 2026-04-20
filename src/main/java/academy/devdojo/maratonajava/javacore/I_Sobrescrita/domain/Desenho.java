package academy.devdojo.maratonajava.javacore.I_Sobrescrita.domain;

public class Desenho {

    private String nome;

    // altera o comportamento que era esperado herdado da superclasse para o novo comportamento que foi implementado
    @Override
    public String toString() {
        return "Desenho{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Desenho(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
