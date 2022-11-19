package br.com.entrega01;

public class Exercicio07 {

    public static void main(String[] args) {
        int[] arrayA = new int[20];

        arrayA[0] = 15;
        arrayA[1] = 9;
        arrayA[2] = 17;
        arrayA[3] = 2;
        arrayA[4] = 20;
        arrayA[5] = 16;
        arrayA[6] = 11;
        arrayA[7] = 6;
        arrayA[8] = 1;
        arrayA[9] = 18;
        arrayA[10] = 5;
        arrayA[11] = 3;
        arrayA[12] = 14;
        arrayA[13] = 1;
        arrayA[14] = 13;
        arrayA[15] = 4;
        arrayA[16] = 7;
        arrayA[17] = 20;
        arrayA[18] = 7;
        arrayA[19] = 8;

        int somaValoresArray = 0;

        for (int i = 0; i < arrayA.length; i++) {
            somaValoresArray += arrayA[i];
        }

        double mediaArray = somaValoresArray / 20;
        int quantidadeValoresAcimaMedia = 0;

        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] > mediaArray) {
                quantidadeValoresAcimaMedia++;
            }
        }

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }

        System.out.printf("A média dos dos valores dentro do array é: %.2f%ne a quantidade de números presentes no array acima da média é: %d", mediaArray, quantidadeValoresAcimaMedia);
    }

}
