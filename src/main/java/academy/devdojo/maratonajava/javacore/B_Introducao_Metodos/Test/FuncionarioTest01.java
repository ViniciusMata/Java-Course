package academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.Test;

import academy.devdojo.maratonajava.javacore.B_Introducao_Metodos.domain.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Maria");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{1890.35, 2351.98, 3154.65});
        funcionario.imprime();

    }
}
