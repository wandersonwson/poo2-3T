package dev.wson.poo2.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
           int opcao;
           do {
            opcao = exibirMenu();
            switch (opcao) {
                case 0 -> opcao = 0;
                case 1 -> somar();
                case 2 -> subtrair();
                case 3 -> multiplicar();
                case 4 -> dividir();
                default -> System.out.println("Opção inválida.");
            }
           } while (opcao != 0);  
    }
    private static int exibirMenu() {
        System.out.println("----------- Calculadora ------------");
        System.out.println("Digite o número da operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");
        return scan.nextInt();
    }
    public static void somar() {
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scan.nextDouble();
        new Soma().calcular(valor1, valor2);
    }
    public static void subtrair() {
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scan.nextDouble();
        new Subtracao().calcular(valor1, valor2);
    }
    public static void multiplicar() {
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scan.nextDouble();
        new Multiplicacao().calcular(valor1, valor2);
    }
    public static void dividir() {
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scan.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scan.nextDouble();
        new Divisao().calcular(valor1, valor2);
    }
}