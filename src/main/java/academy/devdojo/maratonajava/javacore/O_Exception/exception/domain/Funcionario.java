package academy.devdojo.maratonajava.javacore.O_Exception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcioario");

    }

}
