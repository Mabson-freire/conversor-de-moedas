package br.com.mabson.conversordemoedas.models;

public class Calculador {
    private Double taxaDeCambio;
    private Double resultado;

    public Calculador(TaxaDeCambio minhaTaxa, double valorDaConversao) {
        this.taxaDeCambio = Double.valueOf(minhaTaxa.conversion_rate());
        this.resultado = Double.valueOf(minhaTaxa.conversion_rate()) * valorDaConversao;
    }

    public Double getTaxaDeCambio() {
        return taxaDeCambio;
    }

    public Double getResultado() {
        return resultado;
    }
}
