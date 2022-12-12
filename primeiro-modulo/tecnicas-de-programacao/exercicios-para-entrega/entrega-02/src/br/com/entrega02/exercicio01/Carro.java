package br.com.entrega02.exercicio01;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String chassi;
    private double velocidadeMaxima;
    private double velocidadeAtual;
    private int numeroMarchas;
    private int marchaAtual;

    public void reduzirMarcha() {
        marchaAtual = marchaAtual - 1;

        if (marchaAtual < 1) {
            marchaAtual = 1;
        }
    }

    public void aumentarMarcha() {
        marchaAtual += 1;

        if (marchaAtual > numeroMarchas) {
            marchaAtual = numeroMarchas;
        }
    }

    public void acelerar() {
        velocidadeAtual += 1;

        if (velocidadeAtual > velocidadeMaxima)
            velocidadeAtual = velocidadeMaxima;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

}
