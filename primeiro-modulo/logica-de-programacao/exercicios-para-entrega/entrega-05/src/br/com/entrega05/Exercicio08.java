package br.com.entrega05;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número: ");
        Scanner teclado = new Scanner(System.in);
        int numeroInformado = teclado.nextInt();

        if (numeroInformado % 1 == numeroInformado || numeroInformado % numeroInformado == 1) {
            System.out.printf("O número é primo.");
        } else {
            System.out.println("Não é primo.");
        }
    }

}