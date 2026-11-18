package br.com.joaocarloslima.vinteum.model;

public class Jogo {

    private Monte monte;
    private Jogador jogador;
    private Mesa mesa;

    public Jogo() {
        monte = new Monte();
        monte.embaralhar();

        jogador = new Jogador();
        mesa = new Mesa();

        jogador.receberCarta(monte.virar());
        jogador.receberCarta(monte.virar());

        mesa.receberCarta(monte.virar());
        mesa.receberCarta(monte.virar());
    }

    public void pedirCarta() {
        if (!acabou()) {
            jogador.receberCarta(monte.virar());

            if (jogador.getPontos() >= 21) {
                jogador.parar();
                mesa.jogar(monte);
            }
        }
    }

    public void parar() {
        jogador.parar();
        mesa.jogar(monte);
    }

    public boolean acabou() {
        return jogador.parou() && mesa.parou();
    }

    public String resultado() {
        if (!acabou()) {
            return "Em andamento";
        }

        int pontosJogador = jogador.getPontos();
        int pontosMesa = mesa.getPontos();

        if (pontosJogador > 21) {
            return "Jogador perdeu";
        }

        if (pontosMesa > 21 || pontosJogador > pontosMesa) {
            return "Jogador venceu";
        }

        if (pontosJogador < pontosMesa) {
            return "Mesa venceu";
        }

        return "Empate";
    }

    public Monte getMonte() {
        return monte;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public Mesa getMesa() {
        return mesa;
    }
}