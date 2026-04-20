package academy.devdojo.maratonajava.javacore.O_Exception.exception.test;

import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {

        Scanner sc = new Scanner(System.in);

        String userBd = "admin";
        String passBd = "ad123";

        System.out.println("Usuario");
        String userInf = sc.nextLine();

        System.out.println("Senha");
        String passInf = sc.nextLine();

        if (!userBd.equals(userInf) || !passBd.equals(passInf)) {
            throw new LoginInvalidoException("Usuario ou senha inválido");
        }

        System.out.println("Usuário logado com sucesso");

    }

}
