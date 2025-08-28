package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Main;

import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Model.Assinante;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Model.Musica;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Model.Playlist;
import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Model.Podcast;

public class ProjetoFinal_MeuSpotify {

    public void PlayMusic(){

        Musica m1 = new Musica("Bohemian Rhapsody", 360, "Queen", "A Night at the Opera", "Rock");
        Podcast p1 = new Podcast("Hipster Ponto Tech #313 - Ecossistema Java revisitado", 3360, "Paulo Silveira", "Ecossistema moderno de Java");

        Playlist playlist = new Playlist("Favoritos");
        playlist.adicionar(m1);
        playlist.adicionar(p1);

        Assinante user = new Assinante("Rian");
        user.adicionarPlaylist(playlist);

        m1.reproduzir();
        m1.curtir();

        user.listarPlaylists();
    }
}