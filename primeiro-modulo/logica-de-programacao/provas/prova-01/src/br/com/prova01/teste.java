package br.com.prova01;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número A: ");
        int numeroA = teclado.nextInt();

        System.out.println("Digite um número B: ");
        int numeroB = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite uma opção (A, B, C, D ou E) :");
        String opcao = teclado.nextLine();

        switch (opcao.toUpperCase()) {
            case "A":
                int quadradoA = numeroA * numeroA;
                int cuboB = numeroB * numeroB * numeroB;
                int soma = quadradoA + cuboB;
                System.out.printf("A: (%d²) + (%d³) = %d", numeroA, numeroB, soma);
                break;
            case "B":
                double percentualA = numeroA * 0.43;
                System.out.printf("B: 43%s de %d = %f", "%", numeroA, percentualA);
                break;
            case "C":
                double numeroBMais27Porcento = numeroB * 1.27;
                System.out.printf("C: %d + 27%s = %f", numeroB, "%s", numeroBMais27Porcento);
                break;
            case "D":
                if (numeroA % numeroB == 0) {
                    System.out.println(numeroA + " é múltiplo de " + numeroB);
                } else {
                    System.out.println(numeroA + " não é múltiplo de " + numeroB);
                }
                break;
            case "E":
                if (numeroA % 2 == 0) {
                    System.out.println(numeroA + " é par");
                } else {
                    System.out.println(numeroA + " é ímpar");
                }

                if (numeroB > 0) {
                    System.out.println(numeroB + " é positivo");
                } else if (numeroB < 0) {
                    System.out.println(numeroB + " é negativo");
                } else {
                    System.out.println(numeroB + " é neutro");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        teclado.close();
    }

}
