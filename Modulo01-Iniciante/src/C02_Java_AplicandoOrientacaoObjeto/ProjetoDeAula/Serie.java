package C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula;

public class Serie extends TItulo{

    private int temporadas;
    private int espisodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean ativa;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEspisodiosPorTemporada() {
        return espisodiosPorTemporada;
    }

    public void setEspisodiosPorTemporada(int espisodiosPorTemporada) {
        this.espisodiosPorTemporada = espisodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episodios por Temporada: " + espisodiosPorTemporada);
        System.out.println("Minutos por Episodio: " + minutosPorEpisodio);
        System.out.println("Ativa: " + ativa);
    }
}
