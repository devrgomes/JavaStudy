package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula;

import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos.CalculadoraDeTempo;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos.FiltroRecomendacao;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos.Episodio;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos.Filme;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos.Serie;

public class ScreenMatch {

    public static void main(String[] args) {

//    public void MainSM(){

        FiltroRecomendacao filtro =  new FiltroRecomendacao();

        //-----Filme-----//
        Filme novoFilme =  new Filme();

        novoFilme.setNome("Capitão America 2 - O Soldado Invernal");
        novoFilme.setAnoDeLancamento(2014);
        novoFilme.setDuracaoEmMinutos(136);
        novoFilme.getDuracaoEmMinutos();
        novoFilme.setDiretor("Jose Russo e Anthony Russo");
        novoFilme.setIncluidoNoPlano(true);
        filtro.filtra(novoFilme);

        novoFilme.exibeFichaTecnica();

        System.out.println();

        //-----Série-----//
        Serie novaSerie = new Serie();
        Episodio novoEpisodio = new Episodio();

        novaSerie.setNome("You");
        novaSerie.setAnoDeLancamento(2018);
        novaSerie.getDuracaoEmMinutos();
        novaSerie.setTemporadas(5);
        novaSerie.setEpisodiosPorTemporada(10);
        novaSerie.setMinutosPorEpisodio(53);
        novaSerie.setAtiva(false);
        novaSerie.setIncluidoNoPlano(true);

        novoEpisodio.setNumero(1);
        novoEpisodio.setSerie("Lost");
        novoEpisodio.setTotalVisualizacoes(300);
        filtro.filtra(novoEpisodio);

        novaSerie.exibeFichaTecnica();

        //-----Extras-----//
        CalculadoraDeTempo calculadora =  new CalculadoraDeTempo();

        calculadora.inclui(novoFilme);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(novaSerie);
        System.out.println(calculadora.getTempoTotal());

        filtro.filtra(novoFilme);

    }
}