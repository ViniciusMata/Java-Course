package academy.devdojo.maratonajava.javacore.O_Exception.exception.test;

import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
