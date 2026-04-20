package academy.devdojo.maratonajava.introducao;

public class Aula05_EstruturasCondicionais03 {
    public static void main(String[] args) {

        double salario = 3001;
        //Operador ternário (( condicao ? verdadeiro : falso ))
        String resultado = salario > 3000 ? "Eu vou doar 500 pro Vinicius" : "Ainda não tenho condições";
        System.out.println(resultado);

        int idade = 15;
        String categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);

    }
}
