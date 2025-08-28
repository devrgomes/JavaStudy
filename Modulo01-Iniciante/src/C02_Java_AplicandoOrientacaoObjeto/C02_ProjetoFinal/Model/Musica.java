package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Model;

public class Musica extends Audio {
    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo, int duracao, String artista, String album, String genero) {
        super(titulo, duracao);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Artista: " + artista +
                " | Álbum: " + album +
                " | Gênero: " + genero;
    }
}