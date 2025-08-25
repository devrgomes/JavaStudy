package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos;

import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private String serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassificao() {
        if (getTotalVisualizacoes() > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
