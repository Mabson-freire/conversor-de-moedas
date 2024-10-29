package br.com.mabson.conversordemoedas.models;

import java.util.Scanner;

public class PegaValor {
    private String moedaBase;

    public PegaValor(String moedaBase) {
        this.moedaBase = moedaBase;
    }

    public double valorDaConversao() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de " + moedaBase +" para a conversão: ");
        Double valorLido = leitor.nextDouble();

        return valorLido;
    }
}
