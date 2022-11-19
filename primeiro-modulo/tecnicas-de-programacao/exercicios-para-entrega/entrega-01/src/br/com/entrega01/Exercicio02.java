package br.com.entrega01;

public class Exercicio02 {

    public static void main(String[] args) {
        int[] arrayA = new int[20];

        arrayA[0] = -15;
        arrayA[1] = +9;
        arrayA[2] = +17;
        arrayA[3] = -2;
        arrayA[4] = +20;
        arrayA[5] = -16;
        arrayA[6] = +11;
        arrayA[7] = -6;
        arrayA[8] = +1;
        arrayA[9] = -18;
        arrayA[10] = -5;
        arrayA[11] = -3;
        arrayA[12] = +14;
        arrayA[13] = -1;
        arrayA[14] = +13;
        arrayA[15] = +4;
        arrayA[16] = +7;
        arrayA[17] = -20;
        arrayA[18] = -7;
        arrayA[19] = -8;

        int quantidadePositivosArray = 0;
        int quantidadeNegativosArray = 0;

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > 0) {
                quantidadePositivosArray++;
            } else {
                quantidadeNegativosArray++;
            }

            System.out.println(arrayA[i]);
        }

        System.out.printf("A quantidade de números positivos dentro do arrray é: %d%nA quantidade de números negativos dentro do arrray é: %d", quantidadePositivosArray, quantidadeNegativosArray);
    }

}
