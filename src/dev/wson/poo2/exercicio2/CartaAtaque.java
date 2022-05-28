package dev.wson.poo2.exercicio2;

public class CartaAtaque extends Carta {
    protected int poder;
    protected int resistencia;

    public CartaAtaque(String nome, String tipo, int custo, int poder, int resistencia) {
        super(nome, tipo, custo);
        this.poder = poder;
        this.resistencia = resistencia;
    }
    public int getPoder() {
        return poder;
    }
    public int getResistencia() {
        return resistencia;
    }
}