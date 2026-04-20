package academy.devdojo.maratonajava.javacore.M_Interface.domain;

public interface DataLoader {

    // Declaração de atributos em interface ( sempre serão static final )
    public static final int MAX_DATA_SIZE = 10;

    // Por padrão todos os métodos declarados são public abstract
    public abstract void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface DataLoader");
    }

}
