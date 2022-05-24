package dev.wson.poo2.exercicio1;

public class Divisao implements Calculo{
    @Override
    public void calcular(double valor1, double valor2) {
        if(valor2 == 0) {
            System.out.println("Divisão: Erro -> divisão por zero.");
        } else {
            System.out.printf("Divisão: %.2f/%.2f = %.2f%n", valor1, valor2, valor1/valor2);
        }       
    }
}