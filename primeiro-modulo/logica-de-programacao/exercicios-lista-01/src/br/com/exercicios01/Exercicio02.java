package br.com.exercicios01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe os salários líquidos de sua família. \nPrimeiro salário: ");
        Scanner teclado = new Scanner(System.in);
        double primeiroSalario = teclado.nextDouble();

        System.out.println("Informe um segundo salário: ");
        double segundoSalario = teclado.nextDouble();

        double resultado = primeiroSalario + segundoSalario;

        System.out.printf("A soma total dos salários da sua família é de: R$ %.2f", resultado);
    }

}
