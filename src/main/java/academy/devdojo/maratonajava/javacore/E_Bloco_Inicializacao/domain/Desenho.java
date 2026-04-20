package academy.devdojo.maratonajava.javacore.E_Bloco_Inicializacao.domain;

public class Desenho {

    private String nome;
    private int[] episodios;

    /*
    * 1 - Alocado espaço de memória para o objeto que será criado
    * 2 - Cada atributo de clase é criado e inicializado com valores default ou o que foi passado
    * 3 - Bloco de inicialização é executado
    * 4 - Construtor é executado
    * */

    // Bloco de inicializacao não estático ou bloco de inicializacao de instancia
    {
        System.out.println("Bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Desenho(String nome) {
        this.nome = nome;
    }

    public Desenho() {
        for (int episodio : this.episodios){
            System.out.println(episodio);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
