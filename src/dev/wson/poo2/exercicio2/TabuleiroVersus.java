package dev.wson.poo2.exercicio2;

import java.util.List;

public class TabuleiroVersus implements Tabuleiro {
    private List<Jogador> jogadores;
    private final int LIMITE_CARTAS_ATAQUE;
    private final int LIMITE_CARTAS_ESPECIAIS;
    
    public TabuleiroVersus(Jogador jogador1, Jogador jogador2) {
        LIMITE_CARTAS_ATAQUE = 5;
        LIMITE_CARTAS_ESPECIAIS = 2;
        inserirJogador(jogador1);
        inserirJogador(jogador2);
    }
    @Override
    public void inserirJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
    @Override
    public void receberCartaAtaque(CartaAtaque cartaAtaque) {
        //Solução em análise
    }
    @Override
    public boolean definirResultado() {
        //Solução em análise
        return false;
    }
}