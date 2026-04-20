package academy.devdojo.maratonajava.javacore.F_Modificador_Estatico.domain;

public class Desenho {

    private String nome;
    private static int[] episodios;

    /*
    * 0 - Bloco de inicialização estático é executado quadno a JVM carrega a classe
    * 1 - Alocado espaço de memória para o objeto que será criado
    * 2 - Cada atributo de clase é criado e inicializado com valores default ou o que foi passado
    * 3 - Bloco de inicialização é executado
    * 4 - Construtor é executado
    * */

    static {
        System.out.println("Bloco de inicializacao (static) 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    // a ordem de execução de um bloco de inicialização  é de acordo com a implementação ( de cima para baixo )
    static {
        System.out.println("Bloco de inicializacao (static) 2");
    }

    // a ordem de execução de um bloco de inicialização  é de acordo com a implementação ( de cima para baixo )
    {
        System.out.println("Bloco de inicializacao (no static) 3");
    }

    public Desenho(String nome) {
        this.nome = nome;
    }

    public Desenho() {
        for (int episodio : Desenho.episodios){
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
