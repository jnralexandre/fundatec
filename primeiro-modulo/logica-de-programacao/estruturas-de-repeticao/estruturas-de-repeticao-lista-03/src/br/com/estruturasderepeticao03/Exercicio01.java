package br.com.estruturasderepeticao03;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
//        1. O Detran do estado do RS, precisa de um sistema que efetue o cálculo de multas dos motoristas infratores.
//        Faça um programa que leia a velocidade de um carro e a velocidade máxima para a rua, calcule e mostre as multas conforme tabela abaixo:
//        i. Informe 50 reais se estiver até 10km/h acima;
//        ii. Informe 100 reais se estiver entre 11km/h e 30km/h acima;
//        iii. Informe 300 reais se estiver acima de 31km/h acima;
//        O programa deve encerrar quando o usuário informar que não quer mais entrar com
//        dados. Opção de leitura N ou S.

        Scanner teclado = new Scanner(System.in);

        boolean continua = true;
        int velocidadeCarro = 0;
        int velocidadeMaxima = 0;
        int diferencaDeVelocidade = 0;
        String opcao = "S";

        while (continua) {
            System.out.println("Por favor, informe a velocidade do carro: ");
            velocidadeCarro = teclado.nextInt();

            System.out.println("Agora, informe a velocidade máxima permitida pela rua: ");
            velocidadeMaxima = teclado.nextInt();

            diferencaDeVelocidade = velocidadeCarro - velocidadeMaxima;

            if (diferencaDeVelocidade >= 10 && diferencaDeVelocidade < 11) {
                System.out.println("Uma multa de R$50,00 deve ser aplicada.");
            } else if (diferencaDeVelocidade >= 11 && diferencaDeVelocidade <= 30) {
                System.out.println("Uma multa de R$100,00 deve ser aplicada.");
            } else if (diferencaDeVelocidade >= 31) {
                System.out.println("Uma multa de R$300,00 deve ser aplicada.");
            }

            teclado.nextLine();

            System.out.println("Você deseja continuar informando dados? (S para Sim e N para Não: ");
            opcao = teclado.nextLine();

            if (!opcao.equalsIgnoreCase("S")) {
                continua = false;
                System.out.println("Programa encerrado.");
            }
        }
    }

}
