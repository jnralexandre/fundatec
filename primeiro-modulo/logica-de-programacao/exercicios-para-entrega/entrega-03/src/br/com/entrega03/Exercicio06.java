package br.com.entrega03;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        System.out.println("Por favor, informe a quantidade atual em estoque: ");
        Scanner teclado = new Scanner(System.in);
        int quantidadeAtualEstoque = teclado.nextInt();

        System.out.println("Agora, informe a quantidade máxima em estoque: ");
        int quantidadeMaximaEstoque = teclado.nextInt();

        System.out.println("Por fim, informe a quantidade mínima em estoque: ");
        int quantidadeMinimaEstoque = teclado.nextInt();

        int quantidadeMediaEstoque = (quantidadeMaximaEstoque + quantidadeMinimaEstoque) / 2;

        if (quantidadeAtualEstoque >= quantidadeMediaEstoque) {
            System.out.println("A quantidade média do seu estoque é: " + quantidadeMediaEstoque);
            System.out.println("Não efetuar a compra do produto.");
        } else {
            System.out.println("A quantidade média do seu estoque é: " + quantidadeMediaEstoque);
            System.out.println("Efetuar a compra do produto.");
        }
    }

}
