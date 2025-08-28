package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoFinal.Model;

public abstract class Audio {
    private String titulo;
    private int duracao;
    private int reproducoes;
    private int curtidas;

    public Audio(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void reproduzir() {
        reproducoes++;
        System.out.println("Reproduzindo: " + titulo);
    }

    public void curtir() {
        curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Duração: " + duracao + "s";
    }
}