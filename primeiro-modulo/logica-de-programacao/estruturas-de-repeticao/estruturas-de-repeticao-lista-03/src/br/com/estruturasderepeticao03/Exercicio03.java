package br.com.estruturasderepeticao03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean continua = true;
        int opcaoVoto = 0;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;

        while (continua) {
            System.out.println("Por favor, informe os números (1, 2, 3, 4) para os candidatos e (5 para votos nulos ou 6 para votos brancos: ");
            opcaoVoto = teclado.nextInt();

            if (opcaoVoto == -1) {
                continua = false;
                break;
            }

            if (opcaoVoto == 1) {
                candidato1++;
            } else if (opcaoVoto == 2) {
                candidato2++;
            } else if (opcaoVoto == 3) {
                candidato3++;
            } else if (opcaoVoto == 4) {
                candidato4++;
            } else if (opcaoVoto == 5) {
                votosNulos++;
            } else if (opcaoVoto == 6) {
                votosBrancos++;
            }
        }

        System.out.printf("O total de votos para o candidato1 foram de: %d%nO total de votos para o candidato2 foram de: %d%nO total de votos para o candidato3 foram de: %d%nO total de votos para o candidato1 foram de: %d%nO total de votos nulos foram de: %d%nO total de votos brancos foram de: %d", candidato1, candidato2, candidato3, candidato4, votosNulos, votosBrancos);
    }

}
