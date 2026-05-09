package com.lucasodev.ConsultoriaDeImagem.analysis.enums;

public enum BiotypeEnum {
    RECTANGLE("Retangulo", "Ombros, cintura e quadris com medidas semelhantes."),
    HOURGLASS("Ampulheta", " Ombros e quadris com a mesma medida, cintura fina e definida. É um biotipo curvilíneo e harmônico."),
    TRIANGLE("Triangulo/Pera", " Quadril visivelmente mais largo que os ombros e busto. A cintura é fina, e o volume se concentra na parte inferior."),
    INVERTED_TRIANGLE("Triangulo Invertido", " Ombros e costas mais largos que os quadris e cintura. Geralmente possui pernas finas e busto médio/grande, com silhueta atlética"),
    OVAL("Oval/Maça", "A cintura é a parte mais larga do corpo, com silhueta mais arredondada. Ombros e quadris tendem a ser mais estreitos que a região abdominal.");

    private String purtugueseBiotype;
    private String description;

    BiotypeEnum(String portugueseBiotype, String description) {
        this.purtugueseBiotype = portugueseBiotype;
        this.description = description;
    }

    public String getPurtugueseBiotype() {
        return purtugueseBiotype;
    }

    public String getDescription() {
        return description;
    }
}
