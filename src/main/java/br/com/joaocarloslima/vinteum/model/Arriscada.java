package br.com.joaocarloslima.vinteum.model;

public class Arriscada extends EstiloDeJogo {

    @Override
    public boolean deveParar(int pontos) {
        return pontos >= 19;
    }

    @Override
    public String getNome() {
        return "Arriscada";
    }
}