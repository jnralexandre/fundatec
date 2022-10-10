package br.com.estruturasderepeticao03;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;
        int valor3 = 0;
        int contador = 0;

        while (contador < 3) {
            System.out.println("Digite um valor: ");
            Scanner teclado = new Scanner(System.in);
            int numero = teclado.nextInt();

            if (contador == 0) {
                valor1 = numero;
                contador++;
            } else if (contador == 1) {
                if (numero != valor1) {
                    valor2 = numero;
                    contador++;
                } else {
                    System.out.println("Valor não aceito.");
                }
            } else {
                if (numero != valor1 && numero != valor2) {
                    valor3 = numero;
                    contador++;
                } else {
                    System.out.println("Valor não aceito.");
                }
            }
        }

        int soma = valor1 + valor2 + valor3;
        int multiplicacao = (valor1 * valor2) * valor3;
        System.out.printf("A soma dos 3 valores é: %d%nA multiplicação dos 3 valores é: %d", soma, multiplicacao);
    }

}
