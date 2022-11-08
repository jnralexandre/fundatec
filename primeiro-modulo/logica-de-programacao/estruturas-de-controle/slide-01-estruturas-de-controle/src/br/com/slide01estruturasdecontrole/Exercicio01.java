package br.com.slide01estruturasdecontrole;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Informe um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int primeiroNumero = teclado.nextInt();

        System.out.println("Agora informe mais um número inteiro: ");
        int segundoNumero = teclado.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.printf("O maior número é: %d, e o menor número é: %d.", primeiroNumero, segundoNumero);
        } else {
            System.out.printf("O maior número é: %d, e o menor número é: %d.", segundoNumero, primeiroNumero);
        }
    }

}