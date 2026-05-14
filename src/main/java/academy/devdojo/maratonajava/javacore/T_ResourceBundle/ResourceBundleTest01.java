package academy.devdojo.maratonajava.javacore.T_ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "PT"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

    }

}
