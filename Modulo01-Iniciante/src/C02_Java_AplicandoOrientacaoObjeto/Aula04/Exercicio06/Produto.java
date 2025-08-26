package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio06;

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentualDesconto, int quantidade) {
        double total = calcularPrecoTotal(quantidade);
        // Aplica desconto percentual
        return total - (total * percentualDesconto / 100);
    }

    // Getters e setters (opcional)
    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}