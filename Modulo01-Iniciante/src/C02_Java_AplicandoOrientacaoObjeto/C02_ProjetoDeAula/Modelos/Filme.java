package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos;

import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    public String toString() {
        return "Filme: " + getNome() + " (" + getAnoDeLancamento() + "), " +
                "Diretor: " + diretor + ", Duração: " + getDuracaoEmMinutos() + " min";
    }
}