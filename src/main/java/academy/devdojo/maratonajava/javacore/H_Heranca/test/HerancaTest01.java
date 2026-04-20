package academy.devdojo.maratonajava.javacore.H_Heranca.test;

import academy.devdojo.maratonajava.javacore.H_Heranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.H_Heranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.H_Heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("João");
        Funcionario funcionario = new Funcionario("João");

        System.out.println("----- Pessoa Física PF -----");
        pessoa.setCpf("123.456.789-00");
        endereco.setRua("Rua Jose Bonifacio");
        endereco.setCep("1234-567");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("----- Funcionário CLT -----");
        funcionario.setCpf("123.456.789-00");
        endereco.setRua("Rua Jose Bonifacio");
        endereco.setCep("1234-567");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3859.24);

        funcionario.imprime();

        funcionario.relatorioPagamento();

    }
}
