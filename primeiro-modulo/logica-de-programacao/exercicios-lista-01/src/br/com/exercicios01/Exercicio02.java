package br.com.exercicios01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe o primeiro salário: ");
        Scanner teclado = new Scanner(System.in);
        double primeiroSalario = teclado.nextDouble();

        System.out.println("Informe o primeiro salário: ");
        double segundoSalario = teclado.nextDouble();

        double resultado = primeiroSalario + segundoSalario;

        System.out.println("A soma total dos salário é: " + resultado);
    }

}
