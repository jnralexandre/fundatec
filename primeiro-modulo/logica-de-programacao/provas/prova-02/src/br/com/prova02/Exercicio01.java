package br.com.prova02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continua = true;
        double pesoCliente = 0;
        double totalPesos = 0;
        double idadeCliente = 0;
        int totalIdades = 0;
        int contador = 0;

        while (continua) {
            System.out.println("Por favor, informe seu peso: ");
            pesoCliente = teclado.nextDouble();

            System.out.println("Por favor, informe sua idade: ");
            idadeCliente = teclado.nextInt();

            if (idadeCliente < 0) {
                continua = false;
                break;
            }

            contador++;

            totalIdades += idadeCliente;
            totalPesos += pesoCliente;
        }

        double mediaIdades = totalIdades / contador;
        double mediaPesos = totalPesos / contador;

        System.out.printf("a) A média da idade das pessoas é: %f%nb) O total das idades é: %d%nc) A média do peso das pessoas é: %f%nd) O total dos pesos é: %f", mediaIdades, totalIdades, mediaPesos, totalPesos);
    }

}