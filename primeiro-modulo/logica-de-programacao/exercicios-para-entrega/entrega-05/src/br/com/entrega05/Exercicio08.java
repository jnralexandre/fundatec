package br.com.entrega05;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número: ");
        Scanner teclado = new Scanner(System.in);
        int numeroInformado = teclado.nextInt();

        if (numeroInformado <= 1) {
            System.out.printf("O número: %d não é primo.", numeroInformado);
        } else {
            for (int i = 2; i <= numeroInformado; i++) {
                if (numeroInformado % i == 0) {
                    if (i == numeroInformado) {
                        System.out.printf("O número: %d é um primo.", numeroInformado);
                    } else {
                        System.out.printf("O número: %d não é primo.", numeroInformado);
                    }
                }
            }
        }
    }

}