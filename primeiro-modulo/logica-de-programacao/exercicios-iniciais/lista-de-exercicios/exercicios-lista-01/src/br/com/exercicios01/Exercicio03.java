package br.com.exercicios01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Informe um número inteiro. \nPrimeiro número: ");
        Scanner teclado = new Scanner(System.in);
        int primeiroNumero = teclado.nextInt();

        System.out.println("Informe um segundo número inteiro: ");
        int segundoNumero = teclado.nextInt();

        int resultado = primeiroNumero - segundoNumero;

        System.out.println("O resultado da subtração dos dois números informados é: " + resultado);
    }

}
