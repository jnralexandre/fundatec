package br.com.lista04oo;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("Por favor, informe a forma de pagamento (Cartão de crédito, PIX, Boleto): ");
        FormaPagamento formaDePagamento = new FormaPagamento();
        Scanner teclado = new Scanner(System.in);
        formaDePagamento.setDescricao(teclado.nextLine());

        System.out.println("Informe o tipo do frete (Por conta da loja ou do cliente): ");
        Frete frete = new Frete();
        frete.setDescricao(teclado.nextLine());

        System.out.println("Informe o valor do frete: ");
        frete.setValorFrete(teclado.nextDouble());

        System.out.println("Infome o nome fantasia: ");
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNomeFantasia(teclado.nextLine());

        System.out.println("Informe o CNPJ: ");
        fornecedor.setCnpj(teclado.nextLine());

        System.out.println("Informe o contato do fornecedor: ");
        fornecedor.setContato(teclado.nextLine());

        System.out.println("Informe o endereço: ");
        fornecedor.setEndereco(teclado.nextLine());

        System.out.println("Infome o nome do cliente: ");
        Cliente cliente = new Cliente();
        cliente.setNome(teclado.nextLine());

        System.out.println("Informe o CPF do cliente: ");
        cliente.setCpf(teclado.nextLine());

        System.out.println("Informe o contato do cliente: ");
        cliente.setContato(teclado.nextLine());

        System.out.println("Informe o endereço do cliente: ");
        cliente.setEndereco(teclado.nextLine());

        System.out.println("Informe o nome do produto: ");
        Produto produto = new Produto();
        produto.setNome(teclado.nextLine());

        System.out.println("Informe a descrição do produto: ");
        produto.setDescricao(teclado.nextLine());

        System.out.println("Informe o valor do produto: ");
        produto.setValorUnitario(teclado.nextDouble());

        System.out.println("Informe a quantidade de produtos: ");
        produto.setQuantidade(teclado.nextInt());



    }

}
