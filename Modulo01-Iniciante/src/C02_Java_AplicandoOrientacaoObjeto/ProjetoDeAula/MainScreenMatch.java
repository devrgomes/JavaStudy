package C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula;

import C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula.Calculos.CalculadoraDeTempo;
import C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula.Modelos.Filme;
import C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula.Modelos.Serie;

public class MainScreenMatch {

    public static void main(String[] args) {

//    public void MainSM(){

        //-----Filme-----//
        Filme novoFilme =  new Filme();

        novoFilme.setNome("Capitão America 2 - O Soldado Invernal");
        novoFilme.setAnoDeLancamento(2014);
        novoFilme.setDuracaoEmMinutos(136);
        novoFilme.getDuracaoEmMinutos();
        novoFilme.setDiretor("Jose Russo e Anthony Russo");
        novoFilme.setIncluidoNoPlano(true);

        novoFilme.exibeFichaTecnica();

        System.out.println();

        //-----Série-----//
        Serie novaSerie = new Serie();

        novaSerie.setNome("You");
        novaSerie.setAnoDeLancamento(2018);
        novaSerie.getDuracaoEmMinutos();
        novaSerie.setTemporadas(5);
        novaSerie.setEpisodiosPorTemporada(10);
        novaSerie.setMinutosPorEpisodio(53);
        novaSerie.setAtiva(false);
        novaSerie.setIncluidoNoPlano(true);

        novaSerie.exibeFichaTecnica();

        //-----Extras-----//
        CalculadoraDeTempo calculadora =  new CalculadoraDeTempo();

        calculadora.inclui(novoFilme);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(novaSerie);
        System.out.println(calculadora.getTempoTotal());
    }
}