package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio05;

public class Livro implements Calculavel {
    private String titulo;
    private double preco;
    private double desconto; // em percentual (ex: 0.10 = 10%)

    public Livro(String titulo, double preco, double desconto) {
        this.titulo = titulo;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco - (preco * desconto);
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " | Preço final: R$ " + calcularPrecoFinal();
    }
}