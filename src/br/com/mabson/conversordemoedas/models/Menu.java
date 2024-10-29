package br.com.mabson.conversordemoedas.models;

import java.io.IOException;
import java.util.Scanner;
public class Menu {
    private String moedaBase;
    private String moedaDestino;

    public String getMoedaBase() {
        return moedaBase;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public void exibeMenu() throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
            System.out.print("""
                    ***********************************************
                      **** BEM VINDO AO CONVERSOR DE MOEDAS ****
                    ***********************************************
                    Escolha uma das opções abaixo:
    
                    [1] USD => BRL (Dólar para Real)
                    [2] BRL => USD (Real para Dólar)
                    [3] USD => EUR (Dólar para Euro)
                    [4] EUR => USD (Euro para Dólar)
                    [5] BRL => EUR (Real para Euro)
                    [6] EUR => BRL (Euro para Real)
                    [7] Sair
    
                    Sua resposta:""");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    Conversor conversor1 = new Conversor("USD", "BRL");
                    conversor1.calcularTaxaDeCambio();
                    break;
                case 2:
                    Conversor conversor2 = new Conversor("BRL", "USD");
                    conversor2.calcularTaxaDeCambio();
                    break;
                case 3:
                    Conversor conversor3 = new Conversor("USD", "EUR");
                    conversor3.calcularTaxaDeCambio();
                    break;
                case 4:
                    Conversor conversor4 = new Conversor("EUR", "USD");
                    conversor4.calcularTaxaDeCambio();
                    break;
                case 5:
                    Conversor conversor5 = new Conversor("BRL", "EUR");
                    conversor5.calcularTaxaDeCambio();
                    break;
                case 6:
                    Conversor conversor6 = new Conversor("EUR", "BRL");
                    conversor6.calcularTaxaDeCambio();
                    break;
                case 7:
                    System.out.println("Obrigado por usar nosso sistema. " +
                            "\nAté mais!");
                    break;
                default:
                    System.out.println("***Opção inválida! tente novamente.*** \n");
                    exibeMenu();
            }
    }


}
