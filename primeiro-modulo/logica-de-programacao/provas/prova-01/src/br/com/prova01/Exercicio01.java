package br.com.prova01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.printf("A seguir, informe os dados do time local.");
        System.out.printf("%nTime local");

        System.out.printf("%nPor favor, informe o nome: ");
        Scanner teclado = new Scanner(System.in);
        String nomeTimeLocal = teclado.nextLine();

        System.out.printf("%nInforme o número de cestas de 3 pontos: ");
        int numeroCestas3PontosTimeLocal = teclado.nextInt();

        System.out.printf("%nInforme o número de cestas de 2 pontos: ");
        int numeroCestas2PontosTimeLocal = teclado.nextInt();

        System.out.printf("%nInforme o número de lances livres convertidos: ");
        int numeroLancesLivresConvertidosTimeLocal = teclado.nextInt();

        int totalPontosTimeLocal = (numeroCestas3PontosTimeLocal * 3) + (numeroCestas2PontosTimeLocal * 2) + numeroLancesLivresConvertidosTimeLocal;

        teclado.nextLine();

        System.out.printf("A seguir, informe os dados do time visitante.");
        System.out.printf("%nTime visitante");

        System.out.printf("%nPor favor, informe o nome: ");
        String nomeTimeVisitante = teclado.nextLine();

        System.out.printf("%nInforme o número de cestas de 3 pontos: ");
        int numeroCestas3PontosTimeVisitante = teclado.nextInt();

        System.out.printf("%nInforme o número de cestas de 2 pontos: ");
        int numeroCestas2PontosTimeVisitante = teclado.nextInt();

        System.out.printf("%nInforme o número de lances livres convertidos: ");
        int numeroLancesLivresConvertidosTimeVisitante = teclado.nextInt();

        int totalPontosTimeVisitante = (numeroCestas3PontosTimeVisitante * 3) + (numeroCestas2PontosTimeVisitante * 2) + numeroLancesLivresConvertidosTimeVisitante;

        System.out.printf("%nO resultado da partida foi:%n%d pontos para o time local %s%n%d pontos para o time visitante %s", totalPontosTimeLocal, nomeTimeLocal, totalPontosTimeVisitante, nomeTimeVisitante);

        if (totalPontosTimeLocal > totalPontosTimeVisitante) {
            System.out.printf("%nO time vencedor foi: %s", nomeTimeLocal);
        } else if (totalPontosTimeVisitante > totalPontosTimeLocal) {
            System.out.printf("%nO time vencedor foi: %s", nomeTimeVisitante);
        }

        if (totalPontosTimeLocal == totalPontosTimeVisitante) {
            System.out.printf("%nEmpate. Não houve um vencedor. A partida será prorrogada.");
        }
    }

}