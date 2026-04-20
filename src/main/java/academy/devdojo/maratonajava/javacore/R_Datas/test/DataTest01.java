package academy.devdojo.maratonajava.javacore.R_Datas.test;

import java.util.Date;

public class DataTest01 {

    public static void main(String[] args) {

        // 1º classe que Java implementou para trabalhar com Date ((muito utilizado em sistemas legados))
        Date date = new Date(1776720292922L); //long 100000,
        date.setTime(date.getTime() + 3_600_000); // adicionar 1hr
        System.out.println(date);



    }

}
