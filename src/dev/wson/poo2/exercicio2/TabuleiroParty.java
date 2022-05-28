package dev.wson.poo2.exercicio2;

import java.util.List;

public class TabuleiroParty implements Tabuleiro {
    private List<Jogador> jogadores;
    private final int LIMITE_CARTAS_ATAQUE;
    
    public TabuleiroParty(Jogador jogador1, Jogador jogador2, Jogador jogador3, Jogador jogador4, Jogador jogador5) {
        LIMITE_CARTAS_ATAQUE = 34;
        inserirJogador(jogador1);
        inserirJogador(jogador2);
        inserirJogador(jogador3);
        inserirJogador(jogador4);
        inserirJogador(jogador5);
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