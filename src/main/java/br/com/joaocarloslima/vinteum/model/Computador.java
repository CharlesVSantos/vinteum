
package br.com.joaocarloslima.vinteum.model;

public class Computador extends Jogador {

    @Override
    public boolean parou() {
        return getPontos() > 16;
    }
}
