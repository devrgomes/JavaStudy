package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos;

import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return "Episódio " + numero + " - " + nome + " da série " +
                (serie != null ? serie.getNome() : "desconhecida") +
                " (" + totalVisualizacoes + " visualizações)";
    }
}