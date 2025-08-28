package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Audio> audios = new ArrayList<>();

    public Playlist(String nome) {
        this.nome = nome;
    }

    public void adicionar(Audio audio) {
        audios.add(audio);
    }

    public void listar() {
        System.out.println("Playlist: " + nome);
        for (Audio a : audios) {
            System.out.println(a);
        }
    }
}