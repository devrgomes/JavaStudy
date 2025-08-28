package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Model;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public Podcast(String titulo, int duracao, String apresentador, String descricao) {
        super(titulo, duracao);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Apresentador: " + apresentador +
                " | Descrição: " + descricao;
    }
}