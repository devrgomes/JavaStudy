package C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio03;

public class ExibeMusica {

    public void exibeMusica(){
        Musica musica =  new Musica();

        musica.titulo = "Bohemian Rhapsody";
        musica.artista = "Queend";
        musica.anoDeLancamento = 1975;

        musica.avaliarMusica(7);
        musica.avaliarMusica(4);
        musica.avaliarMusica(9);

        musica.exibeFichaTecnica();
    }
}