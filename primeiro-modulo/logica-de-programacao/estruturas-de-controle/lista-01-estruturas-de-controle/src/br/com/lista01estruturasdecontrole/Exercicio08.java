package br.com.lista01estruturasdecontrole;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe sua velocidade: ");
        Scanner teclado = new Scanner(System.in);
        int velocidadeCliente = teclado.nextInt();

        System.out.println("Por fim, informe a velocidade máxima para essa rua: ");
        int velocidadeMaxima = teclado.nextInt();

        int diferencaVelocidade = velocidadeCliente - velocidadeMaxima;

        if (diferencaVelocidade >= 10 && diferencaVelocidade < 11) {
            double multa = 50;
            System.out.printf("Sua velocidade estava %dkm/h acima da velocidade máxima permitida pela rua.%nUma multa de R$%.2f foi aplicada.", diferencaVelocidade, multa);
        } else if (diferencaVelocidade >= 11 && diferencaVelocidade <= 50) {
            double multa = 100;
            System.out.printf("Sua velocidade estava %dkm/h acima da velocidade máxima permitida pela rua.%nUma multa de R$%.2f foi aplicada.", diferencaVelocidade, multa);
        } else if (diferencaVelocidade >= 51) {
            double multa = 300;
            System.out.printf("Sua velocidade estava %dkm/h acima da velocidade máxima permitida pela rua.%nUma multa de R$%.2f foi aplicada.", diferencaVelocidade, multa);
        } else {
            System.out.println("Nenhuma multa seŕa aplicada.");
        }
    }

}
