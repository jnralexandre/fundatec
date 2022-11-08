package br.com.lista01arrays;

public class Exercicio02 {

    public static void main(String[] args) {
        double[] numerosInformados = new double[5];

        numerosInformados[0] = 7.00;
        numerosInformados[1] = -30.00;
        numerosInformados[2] = -21.00;
        numerosInformados[3] = 2.00;
        numerosInformados[4] = -35.00;

        int contador = 0;

        for (int i = 0; i < 5; i++) {
            if (numerosInformados[i] > 0) {
                contador++;
            }
        }

        System.out.printf("A quantidade de números positivos são: %d", contador);
    }

}