package academy.devdojo.maratonajava.javacore.C_Sobrecarga_Metodos.domain;

public class Desenho {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodio) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodio;
    }

    // sobrecarga de metodos
    public void init(String nome, String tipo, int episodio, String genero) {
        this.init(nome, tipo, episodio);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
