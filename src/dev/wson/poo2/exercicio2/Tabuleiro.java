package dev.wson.poo2.exercicio2;

public interface Tabuleiro {
    void inserirJogador(Jogador jogador);
    void receberCartaAtaque(CartaAtaque cartaAtaque);
    boolean definirResultado();
}