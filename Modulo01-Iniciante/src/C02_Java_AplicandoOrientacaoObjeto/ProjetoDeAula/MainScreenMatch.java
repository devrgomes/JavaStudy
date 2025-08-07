package C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula;

public class MainScreenMatch {

    public void MainSM(){

        //-----Filme-----//

        Filme novoFilme =  new Filme();

        novoFilme.setNome("Capitão America 2 - O Soldado Invernal");
        novoFilme.setAnoDeLancamento(2014);
        novoFilme.setDuracaoEmMinutos(136);
        novoFilme.setDiretor("Jose Russo e Anthony Russo");
        novoFilme.setIncluidoNoPlano(true);

        novoFilme.exibeFichaTecnica();

        //-----Série-----//

        Serie novaSerie = new Serie();

        novaSerie.setNome("You");
        novaSerie.setAnoDeLancamento(2018);
        novaSerie.setDuracaoEmMinutos(530);
        novaSerie.setTemporadas(5);
        novaSerie.setEspisodiosPorTemporada(10);
        novaSerie.setMinutosPorEpisodio(53);
        novaSerie.setAtiva(false);
        novaSerie.setIncluidoNoPlano(true);

        novaSerie.exibeFichaTecnica();


    }
}