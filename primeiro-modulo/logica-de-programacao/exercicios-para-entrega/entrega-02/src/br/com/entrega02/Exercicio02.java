package br.com.entrega02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe o valor do salário mínimo: ");
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo = teclado.nextDouble();

        System.out.println("Agora informe seu salário: ");
        double salarioFuncionario = teclado.nextDouble();

        if (salarioFuncionario > salarioMinimo) {
            double salarioAcima = salarioFuncionario - salarioMinimo;
            System.out.printf("Você recebe R$%.2f a mais que um salário mínimo.", salarioAcima);
        } else {
            double salarioAbaixo = salarioFuncionario - salarioMinimo;
            System.out.printf("Você recebe R$%.2f menos do que um salário mínimo.", salarioAbaixo);
        }

    }

}
