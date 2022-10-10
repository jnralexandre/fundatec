package br.com.estruturasdecontrolelista01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, informe um número inteiro: ");
        int numeroInformado = teclado.nextInt();

        if (numeroInformado > 100) {
            System.out.printf("O número informado é maior que 100: %d", numeroInformado);
        } else if (numeroInformado < 100) {
            System.out.printf("O número informado é menor que 100: %d", numeroInformado);
        } else {
            System.out.printf("O número informado é igual a 100: %d", numeroInformado);
        }
    }

}
