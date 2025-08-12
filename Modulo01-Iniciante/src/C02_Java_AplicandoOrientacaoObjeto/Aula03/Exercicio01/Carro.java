package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio01;

public class Carro {

    private String nomeModelo;
    private double precoAno1, precoAno2, precoAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecoAno(double precoAno1, double precoAno2,  double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public double getPrecoMin() {
        return Math.min(precoAno1, Math.min(precoAno2, precoAno3));
    }

    public double getPrecoMax() {
        return Math.max(precoAno1, Math.max(precoAno2, precoAno3));
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome: " + nomeModelo);
        System.out.println("Preço no Ano 1: " + precoAno1);
        System.out.println("Preço do Ano 2: " + precoAno2);
        System.out.println("Preço do Ano 3: " + precoAno3);
        System.out.println("Menor preço: " + getPrecoMin());
        System.out.println("Maior preco: " + getPrecoMax());
    }
}