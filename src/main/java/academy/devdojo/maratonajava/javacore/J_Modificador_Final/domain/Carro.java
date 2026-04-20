package academy.devdojo.maratonajava.javacore.J_Modificador_Final.domain;

public class Carro {

    private String marca;

    // constante sempre precisa ser declarado em maiuscula
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.marca);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
