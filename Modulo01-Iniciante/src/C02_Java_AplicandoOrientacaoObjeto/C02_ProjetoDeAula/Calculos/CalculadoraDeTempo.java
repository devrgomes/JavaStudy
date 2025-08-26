package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos;

import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}