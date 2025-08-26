package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio06;

public class MainPrecoProduto {

    public void exibeServicoProduto() {

        //---Produto---
        Produto produto = new Produto("Notebook", 3500.0);

        // Calculando preço total e com desconto do produto
        int quantidadeProduto = 2;
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço total: R$ " + produto.calcularPrecoTotal(quantidadeProduto));
        System.out.println("Preço com 10% de desconto: R$ " + produto.aplicarDesconto(10, quantidadeProduto));
        System.out.println("-----------------------------");

        //---Serviço---
        Servico servico = new Servico("Aula de Java", 100.0, 3); // 3 horas de duração

        // Calculando preço total e com desconto do serviço
        int quantidadeServico = 2; // duas aulas
        System.out.println("Serviço: " + servico.getDescricao());
        System.out.println("Preço total: R$ " + servico.calcularPrecoTotal(quantidadeServico));
        System.out.println("Preço com 15% de desconto: R$ " + servico.aplicarDesconto(15, quantidadeServico));
    }
}