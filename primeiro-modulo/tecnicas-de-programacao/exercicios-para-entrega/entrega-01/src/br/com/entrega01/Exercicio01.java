package br.com.entrega01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, informe um número inteiro para definir o tamanho do nosso array: ");
        int tamanhoArray = teclado.nextInt();

        int[] arrayCliente = new int[tamanhoArray];

        System.out.println("Agora vamos popular o nosso array.");

        for (int i = 0; i < arrayCliente.length; i++) {
            System.out.println("Informe um número inteiro para adicionar ao nosso array: ");
            arrayCliente[i] = teclado.nextInt();
        }

        System.out.println("Por fim, informe um número inteiro para multiplicar os nossos valores dentro do arrray: ");
        int multiplicador = teclado.nextInt();

        for (int i = 0; i < arrayCliente.length; i++) {
            arrayCliente[i] = arrayCliente[i] * multiplicador;
        }

        for (int i = 0; i < arrayCliente.length; i++) {
            System.out.println("Valores do array multiplicados: " + arrayCliente[i]);
        }
    }

}
