package br.com.entrega01;

import java.util.Scanner;

public class Exerrcicio02 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe um número inteiro para definir o tamanho do nosso array: ");
        Scanner teclado = new Scanner(System.in);
        int tamanhoArray = teclado.nextInt();

        System.out.println("Agora vamos popular o nosso array!");

        int[] arrayCliente = new int[tamanhoArray];

        int maiorValorArray = 0;
        int menorValorArray = 0;
        int somaValoresArray = 0;
        int somaValoresAcimaMediaArray = 0;

        for (int i = 0; i < arrayCliente.length; i++) {
            System.out.println("Informe um número inteiro para adicionar ao nosso array: ");
            arrayCliente[i] = teclado.nextInt();
        }

        for (int i = 0; i < arrayCliente.length; i++) {
            maiorValorArray = arrayCliente[0];
            menorValorArray = arrayCliente[0];

            somaValoresArray += arrayCliente[i];

            if (arrayCliente[i] > maiorValorArray) {
                maiorValorArray = arrayCliente[i];
            }

            if (arrayCliente[i] < menorValorArray) {
                menorValorArray = arrayCliente[i];
            }
        }

        double mediaValoresArray = somaValoresArray / tamanhoArray;

        for (int i = 0; i < arrayCliente.length; i++) {
            if (arrayCliente[i] > mediaValoresArray) {
                somaValoresAcimaMediaArray += 1;
            }
        }

        System.out.printf("a) O maior valor é: %d%n", maiorValorArray);
        System.out.printf("c) O menor valor é: %d%n", menorValorArray);
        System.out.printf("e) A média dos valores presentes no array é: %.2f%n", mediaValoresArray);
        System.out.printf("f) O número de valores acima da média dentro do array é: %d%n", somaValoresAcimaMediaArray);
    }

}
