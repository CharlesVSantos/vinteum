package br.com.joaocarloslima.vinteum.model;

import java.util.List;

public abstract class Participante {

    protected Mao mao = new Mao();
    protected boolean parou = false;

    public void receberCarta(Carta carta) {
        mao.adicionarCarta(carta);
    }

    public void parar() {
        parou = true;
    }

    public List<Carta> getCartas() {
        return mao.getCartas();
    }

    public int getPontos() {
        return mao.getPontos();
    }

    public boolean parou() {
        return parou;
    }
}
