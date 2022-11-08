package br.com.lista01arrays;

public class Exercicio03 {

    public static void main(String[] args) {
        int[] numerosInformados = new int[5];

        numerosInformados[0] = 1;
        numerosInformados[1] = 50;
        numerosInformados[2] = 128;
        numerosInformados[3] = 13;
        numerosInformados[4] = 8;

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < 5; i++) {
            if (numerosInformados[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        System.out.printf("A quantidade de números pares no array é: %d%nA quantidade de números ímpares no array é: %d%n", contadorPares, contadorImpares);
    }

}
