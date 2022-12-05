package br.com.slide01orientacaoobjetos.br.com.slide01orientacaoobjetos;

import br.com.slide01orientacaoobjetos.br.com.slide01orientacaoobjetos.Aluno;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Aluno aluno0 = new Aluno();

        System.out.println("Por favor, informe seu nome: ");
        Scanner teclado = new Scanner(System.in);
        aluno0.setNomeAluno(teclado.nextLine());

        System.out.println("Informe a primeira nota: ");
        aluno0.setNota1(teclado.nextDouble());

        System.out.println("Informe a segundo nota: ");
        aluno0.setNota2(teclado.nextDouble());

        System.out.println("Informe a terceira nota: ");
        aluno0.setNota3(teclado.nextDouble());

        System.out.println("Nome: " + aluno0.getNomeAluno());
        System.out.println("Primeira nota: " + aluno0.getNota1());
        System.out.println(aluno0.getNota2());
        System.out.println(aluno0.getNota3());

        aluno0.calcularMedia();
        System.out.println(aluno0.calcularMedia());
        System.out.println(aluno0.verificarAprovacao(aluno0.calcularMedia()));
    }

}
