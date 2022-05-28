package dev.wson.poo2.exercicio2;

import java.util.List;

public class Jogador {
    private List<Carta> deck;
    private int vida;
    public Jogador(List<Carta> deck, int vida) {
        this.deck = deck;
        this.vida = vida;
    }
    public List<Carta> getDeck() {
        return deck;
    }
    public int getVida() {
        return vida;
    }
}