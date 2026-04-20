package academy.devdojo.maratonajava.javacore.O_Exception.exception.domain;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
