
package br.com.joaocarloslima.vinteum.model;

public class Jogo {

    private Monte monte = new Monte();
    private Jogador jogador = new Jogador();
    private Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuirCartaParaJogador(Jogador jogador) {

        if (jogador.parou()) {
            return null;
        }

        Carta carta = monte.virar();
        jogador.receberCarta(carta);

        return carta;
    }

    public boolean acabou() {

        boolean jogadorTerminou =
                jogador.parou() || jogador.getPontos() > 21;

        boolean computadorTerminou =
                computador.parou() || computador.getPontos() > 21;

        return jogadorTerminou && computadorTerminou;
    }

    public String resultado() {

        int pontosJogador = jogador.getPontos();
        int pontosComputador = computador.getPontos();

        if (pontosJogador > 21) {
            return "Você perdeu";
        }

        if (pontosComputador > 21) {
            return "Você ganhou";
        }

        if (pontosJogador > pontosComputador) {
            return "Você ganhou";
        }

        if (pontosComputador > pontosJogador) {
            return "Você perdeu";
        }

        return "Empate";
    }

    public Computador getComputador() {
        return computador;
    }

    public Jogador getJogador() {
        return jogador;
    }
}

