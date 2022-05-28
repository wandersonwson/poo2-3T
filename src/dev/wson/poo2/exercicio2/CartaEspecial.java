package dev.wson.poo2.exercicio2;

public class CartaEspecial extends CartaAtaque implements Especial {
    public CartaEspecial(String nome, String tipo, int custo, int poder, int resistencia) {
        super(nome, tipo, custo, poder, resistencia);
    }
    @Override
    public void exibirEfeitos() {
        System.out.println("Efeitos especiais em ação!");
    }
}