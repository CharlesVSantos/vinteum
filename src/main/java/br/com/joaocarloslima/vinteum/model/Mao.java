
package br.com.joaocarloslima.vinteum.model;

import java.util.ArrayList;
import java.util.List;

public class Mao {

    private List<Carta> cartas = new ArrayList<>();

    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public int getPontos() {
        int pontos = 0;

        for (Carta carta : cartas) {
            pontos += carta.getNumero();
        }

        return pontos;
    }
}
