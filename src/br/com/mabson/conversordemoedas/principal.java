package br.com.mabson.conversordemoedas;

import br.com.mabson.conversordemoedas.models.Menu;

import java.io.IOException;

public class principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu menu = new Menu();
        while (menu.exibeMenu()) {
        };
    }
}
