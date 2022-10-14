package br.com.entrega05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int totalIdades = 0;
        double totalPesos = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Por favor, informe seu peso: ");
            double pesoCliente = teclado.nextDouble();

            totalPesos += pesoCliente;

            System.out.println("Por fim, informe sua idade: ");
            int idadeCliente = teclado.nextInt();

            totalIdades += idadeCliente;
        }

        double mediaIdades = totalIdades / 20;
        double mediaPesos = totalPesos / 20;

        System.out.printf("A média da idade das pessoas é: %f%nO total das idades é: %d%nA média dos pesos é: %f%nO total dos pesos é: %f", mediaIdades, totalIdades, mediaPesos, totalPesos);
    }

}
