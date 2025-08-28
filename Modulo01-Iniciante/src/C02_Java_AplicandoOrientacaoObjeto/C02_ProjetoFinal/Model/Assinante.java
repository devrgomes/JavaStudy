package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Model;

import java.util.ArrayList;
import java.util.List;

public class Assinante {
    private String nome;
    private List<Playlist> playlists = new ArrayList<>();

    public Assinante(String nome) {
        this.nome = nome;
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void listarPlaylists() {
        System.out.println("Assinante: " + nome);
        for (Playlist p : playlists) {
            p.listar();
        }
    }
}