package br.com.estruturasderepeticao03;

public class Exercicio02 {

    public static void main(String[] args) {
        boolean continua = true;
        double alturaJoao = 1.37;
        double alturaPedro = 1.20;
        int contadorPedro = 0;
        double alturaFinalJoao = 0;
        double alturaFinalPedro = 0;

        while (continua) {
            alturaJoao += 0.02;

            alturaPedro += 0.03;
            contadorPedro++;

            alturaFinalJoao = alturaJoao;
            alturaFinalPedro = alturaPedro;

            if (alturaPedro == alturaJoao) {
                System.out.printf("A quantidade de meses que Pedro demorou para alcançar a altura do João é: %d meses%nA altura atual do João é: %.2f metros %nA altura do Pedro é: %.2f metros", contadorPedro, alturaFinalJoao, alturaFinalPedro);
            }
        }
    }

}
