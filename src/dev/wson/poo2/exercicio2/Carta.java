package dev.wson.poo2.exercicio2;

public abstract class Carta {
    protected String nome;
    protected String tipo;
    protected int custo;
    
    public Carta(String nome, String tipo, int custo) {
        this.nome = nome;
        this.tipo = tipo;
        this.custo = custo;
    }
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public int getCusto() {
        return custo;
    }
}