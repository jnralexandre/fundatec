package br.com.lista02estruturasdecontrole;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número inteiro: ");
        Scanner teclado = new Scanner(System.in);
        int numeroInformado = teclado.nextInt();

        if (numeroInformado > 0) {
            System.out.printf("Este número é positivo: %d", numeroInformado);
        } else if (numeroInformado < 0) {
            System.out.printf("Este número é negativo: %d", numeroInformado);
        } else if (numeroInformado == 0) {
            System.out.printf("Este número não é positivo e nem negativo: %d", numeroInformado);
        }
    }

}
