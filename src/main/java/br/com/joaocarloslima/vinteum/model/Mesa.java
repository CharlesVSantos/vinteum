package br.com.joaocarloslima.vinteum.model;

import java.util.List;

public class Mesa extends Participante {

    private EstiloDeJogo estilo;

    public void jogar(Monte monte) {
        while (!parou && getPontos() < 21) {
            receberCarta(monte.virar());

            if (estilo.deveParar(getPontos())) {
                parar();
            }
        }

        parar();
    }

    public EstiloDeJogo getEstilo() {
        return estilo;
    }

    public void setEstilo(EstiloDeJogo estilo) {
        this.estilo = estilo;
    }
}

