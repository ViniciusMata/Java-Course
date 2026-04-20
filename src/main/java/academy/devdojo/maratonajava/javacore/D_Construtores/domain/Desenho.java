package academy.devdojo.maratonajava.javacore.D_Construtores.domain;

public class Desenho {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    // Contrutor nunca tem void
    public Desenho(String nome, String tipo, int episodio, String genero) {
        // Chama um construtor dentro de outro construtor
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodio;
        this.genero = genero;
    }

    // Contrutor nunca tem void
    public Desenho(String nome, String tipo, int episodio, String genero, String estudio) {
        // Chama um construtor dentro de outro construtor
        this(nome, tipo, episodio, genero);
        this.estudio = estudio;
    }

    public Desenho() {
        System.out.println("Dentro do construtor vazio");
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Estúdio: " + this.estudio);
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

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
