package br.com.entrega02.exercicio02;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("Por favor, informe seu nome: ");
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome(teclado.nextLine());

        System.out.println("Informe seu CPF: ");
        pessoa1.setCpf(teclado.nextLine());

        System.out.println("Informe o nome do seu pai: ");
        pessoa1.setPai(teclado.nextLine());

        System.out.println("Por fim, informe o nome da sua mãe: ");
        pessoa1.setMae(teclado.nextLine());

        System.out.println("Seu nome: " + pessoa1.getNome());
        System.out.println("Seu CPF: " + pessoa1.getCpf());
        System.out.println("Nome do seu pai: " + pessoa1.getPai());
        System.out.println("Nome da sua mãe: " + pessoa1.getMae());
    }

}
