package br.com.entrega03;

public class Orcamento {

    public static void main(String[] args) {
        Cliente cliente;
        Atendente atendente;
        Loja loja;
        Produto produto;

        Cliente cliente01 = new Cliente();

        cliente01.setNome("Carlos Silva");
        cliente01.setCpf("126156748912");
        cliente01.setContato("51989756134");
        cliente01.setEndereco("Rua Doutor Flores, 351");

        System.out.println("Nome do Cliente: " + cliente01.getNome());
        System.out.println("CPF do cliente: " + cliente01.getCpf());
        System.out.println("Contato do cliente: " + cliente01.getContato());
        System.out.println("Endereço do cliente: " + cliente01.getEndereco());

        Atendente atendente1 = new Atendente();

        atendente1.setNome("Vitória Moreira");
        atendente1.setCpf("1654323456712");
        atendente1.setNumeroCracha("5113");
        atendente1.setLogin("vt5113");
        atendente1.setSenha("vt0132");

        System.out.println("Nome do atendente: " + atendente1.getNome());
        System.out.println("CPF do atendente: " + atendente1.getCpf());
        System.out.println("Número do cracha do atendente: " + atendente1.getNumeroCracha());
        System.out.println("Login do atendente: " + atendente1.getLogin());
        System.out.println("Senha do atendente: " + atendente1.getSenha());

        Loja loja1 = new Loja();

        loja1.setNome("Vissz");
        loja1.setCidade("Viamão");

        System.out.println("Nome da loja: " + loja1.getNome());
        System.out.println("Cidade da loja: " + loja1.getCidade());

        Produto produto1 = new Produto();

        produto1.setNome("Torneira Brate");
        produto1.setDescricao("Torneira de ferro");
        produto1.setValorUnitario(67.00);

        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Descrição do produto: " + produto1.getDescricao());
        System.out.println("Valor unitário: " + produto1.getValorUnitario());

    }

}
