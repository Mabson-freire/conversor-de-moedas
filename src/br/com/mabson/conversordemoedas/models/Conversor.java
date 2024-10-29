package br.com.mabson.conversordemoedas.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.rmi.RemoteException;

public class Conversor {
    private String moedaBase;
    private String moedaDestino;
    private double valorDaConversao;

    public Conversor(String moedaBase, String moedaDestino, double valorDaConversao) {
        this.moedaBase = moedaBase;
        this.moedaDestino = moedaDestino;
        this.valorDaConversao = valorDaConversao;
    }

    public void calcularTaxaDeCambio() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/0283e563ae5118e97f97f2a1/pair/" + moedaBase + "/" + moedaDestino))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = response.body();

            TaxaDeCambio minhaTaxa = gson.fromJson(json, TaxaDeCambio.class);
            Calculador novoCalculo = new Calculador(minhaTaxa, valorDaConversao);

            System.out.println("Paridade escolhida: " + moedaBase + " => " + moedaDestino);

            System.out.println(String.format("%.2f %S Corresponde a: %.2f %S (Taxa de câmbio: %f)",
                    valorDaConversao, moedaBase, novoCalculo.getResultado(), moedaDestino, novoCalculo.getTaxaDeCambio()));

            Menu novoMenu = new Menu();
        }catch (Exception e ) {
            throw new RemoteException("conversão inválida");
        }
    }
}

