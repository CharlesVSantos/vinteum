package br.com.joaocarloslima.vinteum.model;

public class Padrao extends EstiloDeJogo {

    @Override
    public boolean deveParar(int pontos) {
        return pontos >= 17;
    }

    @Override
    public String getNome() {
        return "Padrão";
    }
}