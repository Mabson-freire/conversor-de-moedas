package br.com.mabson.conversordemoedas.models;

public class Currency {
    private String code;
    private String model;

    public Currency(String code, String model) {
        this.code = code;
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public String getModel() {
        return model;
    }
}
