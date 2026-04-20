package academy.devdojo.maratonajava.javacore.K_Enumeracao.test;

import academy.devdojo.maratonajava.javacore.K_Enumeracao.domain.Cliente;
import academy.devdojo.maratonajava.javacore.K_Enumeracao.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.K_Enumeracao.domain.TipoPagamento;

public class ClienteTest01 {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Vinícius Lourenço da Mata", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Vinícius Mata Ltda", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(1000));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(1000));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getDescricao());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorDescricao("Pessoa Física");
        System.out.println(tipoCliente2);

    }

}
