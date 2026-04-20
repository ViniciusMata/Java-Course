package academy.devdojo.maratonajava.javacore.M_Interface.test;

import academy.devdojo.maratonajava.javacore.M_Interface.domain.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.M_Interface.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.M_Interface.domain.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        DataBaseLoader.retriveMaxDataSize();


    }

}
