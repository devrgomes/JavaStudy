package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificao() >= 4) {
            System.out.println("Está entre os melhores do momento");
        } else if (classificavel.getClassificao() >= 2) {
            System.out.println("Muito bem avaliado");
        }
    }
}
