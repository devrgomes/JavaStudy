package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio06;

public class Servico implements Vendavel {
    private String descricao;
    private double precoHora;
    private int duracaoHoras;

    public Servico(String descricao, double precoHora, int duracaoHoras) {
        this.descricao = descricao;
        this.precoHora = precoHora;
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * duracaoHoras * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentualDesconto, int quantidade) {
        double total = calcularPrecoTotal(quantidade);
        // Aplica desconto percentual
        return total - (total * percentualDesconto / 100);
    }

    // Getters e setters (opcional)
    public String getDescricao() {
        return descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }
}