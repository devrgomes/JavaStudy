package C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula.Calculos;

import C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula.Modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t) {
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}