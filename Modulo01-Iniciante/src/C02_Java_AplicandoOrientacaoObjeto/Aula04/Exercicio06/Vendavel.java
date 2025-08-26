package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio06;

public interface Vendavel {

    double calcularPrecoTotal(int quantidade);

    double aplicarDesconto(double percentualDesconto, int quantidade);
}