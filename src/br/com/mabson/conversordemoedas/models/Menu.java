package br.com.mabson.conversordemoedas.models;

import java.io.IOException;
import java.util.Scanner;
public class Menu {
    private int opcao;

    public int getOpcao() {
        return opcao;
    }

    public boolean exibeMenu() throws IOException, InterruptedException {
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
    
                    Sua resposta: """);

        this.opcao = leitor.nextInt();
        if (opcao > 0 && opcao <= 7) {
            switch (this.opcao) {
                case 1:
                    PegaValor valorDeConversao = new PegaValor("USD");
                    Conversor conversor1 = new Conversor("USD", "BRL", valorDeConversao.valorDaConversao());
                    conversor1.calcularTaxaDeCambio();
                    break;
                case 2:
                    PegaValor valorDeConversao2 = new PegaValor("BRL");
                    Conversor conversor2 = new Conversor("BRL", "USD", valorDeConversao2.valorDaConversao());
                    conversor2.calcularTaxaDeCambio();
                    break;
                case 3:PegaValor valorDeConversao3 = new PegaValor("USD");
                    Conversor conversor3 = new Conversor("USD", "EUR", valorDeConversao3.valorDaConversao());
                    conversor3.calcularTaxaDeCambio();
                    break;
                case 4:
                    PegaValor valorDeConversao4 = new PegaValor("EUR");
                    Conversor conversor4 = new Conversor("EUR", "USD", valorDeConversao4.valorDaConversao());
                    conversor4.calcularTaxaDeCambio();
                    break;
                case 5:
                    PegaValor valorDeConversao5 = new PegaValor("BRL");
                    Conversor conversor5 = new Conversor("BRL", "EUR", valorDeConversao5.valorDaConversao());
                    conversor5.calcularTaxaDeCambio();
                    break;
                case 6:
                    PegaValor valorDeConversao6 = new PegaValor("EUR");
                    Conversor conversor6 = new Conversor("EUR", "BRL", valorDeConversao6.valorDaConversao());
                    conversor6.calcularTaxaDeCambio();
                    break;
                case 7:
                    System.out.println("Obrigado por utilizar o nosso sistema, Até mais!");
                    return false;
                default:
                    System.out.println("Opção inválida tente novamente");
            }
            return true;
        }else {
            return true;
        }
    }
}
