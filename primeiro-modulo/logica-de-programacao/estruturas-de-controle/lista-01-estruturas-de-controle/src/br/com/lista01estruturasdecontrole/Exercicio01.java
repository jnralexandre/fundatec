package br.com.lista01estruturasdecontrole;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, informe um número inteiro: ");
        int numeroInformado = teclado.nextInt();

        if (numeroInformado % 3 == 0) {
            System.out.printf("O número informado é múltiplo de 3: %d", numeroInformado);
        } else {
            System.out.printf("O número informado não é múltiplo de 3: %d", numeroInformado);
        }
    }

}
