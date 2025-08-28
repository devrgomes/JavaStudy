package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula;

import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos.CalculadoraDeTempo;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos.FiltroRecomendacao;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos.Episodio;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos.Filme;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos.Serie;

import java.sql.SQLOutput;

public class ScreenMatch {

    public void MainScreenMatch(){

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setDiretor("Francis Ford Coppola");
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        System.out.println("");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        System.out.println("");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setDiretor("James Cameron");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        outroFilme.exibeFichaTecnica();

        System.out.println("");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}