package br.com.exercicios01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Informe o salário líquido da sua família. \nPrimeiro salário: ");
        Scanner teclado = new Scanner(System.in);
        double primeiroSalario = teclado.nextDouble();

        System.out.println("Informe um segundo salário: ");
        double segundoSalario = teclado.nextDouble();

        double resultado = primeiroSalario + segundoSalario;

        System.out.println("A soma total dos salários da sua família é de: R$" + resultado);
    }

}
