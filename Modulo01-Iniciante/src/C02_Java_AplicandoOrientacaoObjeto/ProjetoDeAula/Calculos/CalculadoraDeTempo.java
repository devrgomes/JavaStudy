package C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula.Calculos;

import C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula.Modelos.Filme;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
