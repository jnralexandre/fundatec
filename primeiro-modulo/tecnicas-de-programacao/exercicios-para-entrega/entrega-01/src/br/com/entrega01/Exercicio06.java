package br.com.entrega01;

public class Exercicio06 {

    public static void main(String[] args) {
        int[] arrayA = new int[10];

        arrayA[0] = 5;
        arrayA[1] = 10;
        arrayA[2] = 11;
        arrayA[3] = 1;
        arrayA[4] = 13;
        arrayA[5] = 2;
        arrayA[6] = 4;
        arrayA[7] = 24;
        arrayA[8] = 19;
        arrayA[9] = 21;

        int maiorValorArray = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < arrayA.length; i++) {
            if (i == 0) {
                maiorValorArray = arrayA[i];

            }

            if (arrayA[i] > maiorValorArray) {
                maiorValorArray = arrayA[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("a) O maior valor é: %d%n", maiorValorArray);
        System.out.printf("b) O índice do maior valor é: %d%n", posicaoMaior);
    }

}
