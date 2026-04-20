package academy.devdojo.maratonajava.javacore.H_Heranca.domain;

public class Funcionario extends Pessoa {

    // Herança é exatamente extender atributos de outra classe
    private double salario;

    static {
        System.out.println("Dentro do bloco inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco inicialização não estático de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco inicialização não estático de Funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");

    }

    public void imprime() {
        // super é a palavra reservada para acessar os atributos e métodos da classe pai
        // super.imprime() chama o método imprime() da classe pai (Pessoa)
        super.imprime();
        System.out.println("Salário: R$ " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o pagamento de R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
