package br.com.estruturasderepeticaolista01;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            System.out.println("Por favor, informe um número inteiro e positivo: ");
            int numeroCliente = teclado.nextInt();
            System.out.printf("Tabuada do %d%n", numeroCliente);

            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                int tabuada = numeroCliente * multiplicador;
                System.out.printf("%d x %d = %d%n", numeroCliente, multiplicador, tabuada);
            }
        }
    }

}
