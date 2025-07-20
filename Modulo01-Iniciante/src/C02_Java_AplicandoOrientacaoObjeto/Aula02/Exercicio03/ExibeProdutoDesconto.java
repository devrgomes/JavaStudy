package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio03;

public class ExibeProdutoDesconto {

    public void exibirNovoProduto() {
        Produto produto = new Produto();

        produto.setNome("Notebook");
        produto.setPreco(3000.00);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço antes do desconto: R$ " + produto.getPreco());

        produto.aplicarDesconto();

        System.out.println("Preço após desconto: R$ " + produto.getPreco());
    }
}