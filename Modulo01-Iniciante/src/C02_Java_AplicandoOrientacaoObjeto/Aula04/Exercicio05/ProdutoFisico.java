package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio05;

public class ProdutoFisico implements Calculavel {
    private String nome;
    private double preco;
    private double taxa; // em percentual (ex: 0.05 = 5%)

    public ProdutoFisico(String nome, double preco, double taxa) {
        this.nome = nome;
        this.preco = preco;
        this.taxa = taxa;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + (preco * taxa);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço final: R$ " + calcularPrecoFinal();
    }
}