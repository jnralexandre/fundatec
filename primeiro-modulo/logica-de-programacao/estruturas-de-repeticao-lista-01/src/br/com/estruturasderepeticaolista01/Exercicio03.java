package br.com.estruturasderepeticaolista01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadePessoasMaiores18 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Por favor, informe sua idade: ");
            int lerIdade = teclado.nextInt();
            if (lerIdade > 18) {
                quantidadePessoasMaiores18 = quantidadePessoasMaiores18 + 1;
            }
        }
        System.out.printf("A quantidade de pessoas com idade maior que 18 anos é: %d", quantidadePessoasMaiores18);
    }

}
