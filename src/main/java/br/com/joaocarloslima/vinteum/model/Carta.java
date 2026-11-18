
package br.com.joaocarloslima.vinteum.model;

public class Carta {

    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public String getImagem() {

        String valor;

        switch (numero) {
            case 1: valor = "Ace"; break;
            case 11: valor = "Jack"; break;
            case 12: valor = "Queen"; break;
            case 13: valor = "King"; break;
            default: valor = String.valueOf(numero);
        }

        return valor + naipe.name() + ".png";
    }

    public String imagePath() {
        return getImagem();
    }
}
