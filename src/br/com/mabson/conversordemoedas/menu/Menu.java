package br.com.mabson.conversordemoedas.menu;

import java.util.Scanner;
public class Menu {
    private int paridade;

    public int getParidade() {
        return paridade;
    }

    public void exibeMenu() {
        Scanner leitor = new Scanner(System.in);
            System.out.print("""
                    ***********************************************
                      **** BEM VINDO AO CONVERSOR DE MOEDAS ****
                    ***********************************************
                    Escolha uma das opções abaixo:
    
                    [1] USD => BRL (Dólar p/ Real)
                    [2] BRL => USD (Real p/ Dólar)
                    [3] USD => EUR (Dólar p/ Euro)
                    [4] EUR => USD (Euro p/ Dólar)
                    [5] BRL => EUR (Real p/ Euro)
                    [6] EUR => BRL (Euro p/ Real)
                    [7] Sair
    
                    Sua resposta: """);
            int paridade = leitor.nextInt();

            switch (paridade) {
                case 1:
                    System.out.println("Você digitou 1");
                    break;
                case 2:
                    System.out.println("Você digitou 2");
                    break;
                case 3:
                    System.out.println("Você digitou 3");
                    break;
                case 4:
                    System.out.println("Você digitou 4");
                    break;
                case 5:
                    System.out.println("Você digitou 5");
                    break;
                case 6:
                    System.out.println("Você digitou 6");
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
