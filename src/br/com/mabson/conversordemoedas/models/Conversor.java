package br.com.mabson.conversordemoedas.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private String moedaBase;
    private String moedaDestino;
    private double taxaDeCambio;

    public Conversor(String moedaBase, String moedaDestino) {
        this.moedaBase = moedaBase;
        this.moedaDestino = moedaDestino;
    }

    public void calcularTaxaDeCambio() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/0283e563ae5118e97f97f2a1/pair/" + moedaBase + "/" + moedaDestino))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String resposta = response.body();
        System.out.println("Paridade escolhida: " + moedaBase + " => " + moedaDestino);
        System.out.println("resposta da API: " + resposta);
    }
}

