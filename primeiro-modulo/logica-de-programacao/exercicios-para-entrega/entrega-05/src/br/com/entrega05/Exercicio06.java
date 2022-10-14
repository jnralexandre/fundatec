package br.com.entrega05;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        int quantidadeFamiliasEntrevistadas = 0;
        int numeroFilhosFamilias = 0;
        int somaNumeroFilhos = 0;
        double rendaBrutaFamilias = 0;
        double somaSalarios = 0;
        boolean continua = true;
        int quantidadeSuperior1800 = 0;
        int quantidadeSuperior3filhos = 0;
        String continuarColeta = "S";

        Scanner teclado = new Scanner(System.in);

        while (continua) {
            System.out.println("Por favor, informe o número de filhos que você possui: ");
            numeroFilhosFamilias = teclado.nextInt();

            somaNumeroFilhos += numeroFilhosFamilias;

            System.out.println("Por fim, informe a renda bruta da família: ");
            rendaBrutaFamilias = teclado.nextDouble();

            somaSalarios += rendaBrutaFamilias;

            quantidadeFamiliasEntrevistadas++;

            if (rendaBrutaFamilias > 1800) {
                quantidadeSuperior1800++;
            }

            if (numeroFilhosFamilias > 3) {
                quantidadeSuperior3filhos++;
            }

            teclado.nextLine();

            System.out.println("Deseja informar mais dados? (S para Sim e N para Não: ");
            continuarColeta = teclado.nextLine();
            if (!continuarColeta.equalsIgnoreCase("s")) {
                continua = false;
                break;
            }
        }

        double mediaNumeroFilhos = somaNumeroFilhos / quantidadeFamiliasEntrevistadas;
        double mediaSalarios = somaSalarios / quantidadeFamiliasEntrevistadas;

        System.out.printf("a) A média do número de filhos das famílias é de: %.2f%nb) A média dos salários é: %.2f%nc) Quantidade de famílias com salário superior a R$1800,00: %d%nd) Quantidade de famílias com mais de 3 filhos: %d", mediaNumeroFilhos, mediaSalarios, quantidadeSuperior1800, quantidadeSuperior3filhos);
    }

}
