package br.com.lista04oo;

import java.util.List;

public class PedidoVenda {
    private FormaPagamento formaPagamento;
    private Frete frete;
    private Cliente cliente;
    private String descricao;
    private String dataVenda;
    private String status;
    private List<Produto> produtos;

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String validarProdutos() {
        return "carro";
    }

    public Double getValorTotal() {
        Double valorTotal = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            valorTotal = valorTotal + produto.getValorUnitario();
        }

        valorTotal = valorTotal + frete.getValorFrete();
        return valorTotal;
    }

    public Double ValorUnitario() {
        return 0.0;
    }

}