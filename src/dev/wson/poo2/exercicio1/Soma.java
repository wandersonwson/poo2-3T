package dev.wson.poo2.exercicio1;

public class Soma implements Calculo{
    @Override
    public void calcular(double valor1, double valor2) {
        System.out.printf("Soma: %.2f+%.2f = %.2f%n", valor1, valor2, valor1+valor2);
    }
}