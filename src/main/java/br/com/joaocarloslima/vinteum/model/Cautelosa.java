package br.com.joaocarloslima.vinteum.model;

public class Cautelosa extends EstiloDeJogo {

    @Override
    public boolean deveParar(int pontos) {
        return pontos >= 15;
    }

    @Override
    public String getNome() {
        return "Cautelosa";
    }
}