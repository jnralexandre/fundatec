package br.com.estruturasderepeticao02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int populacaoTotal = 50;
        double maiorAltura = 0;
        double menorAltura = 0;
        double mediaAlturaMulheres = 0;
        double somaAlturaMulheres = 0;
        double mediaAlturaPopulacao = 0;
        double somaMediaAlturaPopulacao = 0;
        int quantidadeTotalMulheres = 0;
        int quantidadeTotalHomens = 0;
        int percentualHomens = 0;
        int percentualTotalPopulacao = 100;
        String sinalPorcentagem = "%";

        for (int i = 0; i < populacaoTotal; i++) {
            System.out.println("Por favor, informe sua altura: ");
            double alturaCliente = teclado.nextDouble();

            teclado.nextLine();

            System.out.println("Por fim, informe seu sexo (Masculino/Feminino): ");
            String sexoCliente = teclado.nextLine();

            somaMediaAlturaPopulacao = somaMediaAlturaPopulacao + alturaCliente;

            if (i == 0) {
                maiorAltura = alturaCliente;
                menorAltura = alturaCliente;
            } else if (alturaCliente > maiorAltura) {
                maiorAltura = alturaCliente;
            } else if (alturaCliente < menorAltura) {
                menorAltura = alturaCliente;
            }

            if (sexoCliente.equalsIgnoreCase("feminino")) {
                quantidadeTotalMulheres = quantidadeTotalMulheres + 1;
                somaAlturaMulheres += alturaCliente;
            }

            if (sexoCliente.equalsIgnoreCase("masculino")) {
                quantidadeTotalHomens = quantidadeTotalHomens + 1;

            }
        }

        percentualHomens = (percentualTotalPopulacao / populacaoTotal) * quantidadeTotalHomens;
        mediaAlturaMulheres = somaAlturaMulheres / quantidadeTotalMulheres;
        mediaAlturaPopulacao = somaMediaAlturaPopulacao / populacaoTotal;

        System.out.printf("a) A maior altura encontrada foi: %f%na) A menor altura encontrada foi: %f%nb) A média da altura das mulheres é: %f%nc) A média de altura da população é: %f%nd) O percentual de homens na população é: %d%s", maiorAltura, menorAltura, mediaAlturaMulheres, mediaAlturaPopulacao, percentualHomens, sinalPorcentagem);
    }

}