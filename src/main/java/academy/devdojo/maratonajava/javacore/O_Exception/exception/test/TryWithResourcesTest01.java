package academy.devdojo.maratonajava.javacore.O_Exception.exception.test;

import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.O_Exception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {

    public static void main(String[] args) {
        lerArquivo1();
    }

    public static void lerArquivo1() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2();) {
        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
