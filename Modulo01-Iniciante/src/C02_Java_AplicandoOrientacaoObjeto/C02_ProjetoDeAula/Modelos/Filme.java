package C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Modelos;

import C02_Java_AplicandoOrientacaoObjeto.C02_ProjetoDeAula.Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Diretor: " + diretor);
    }

    @Override
    public int getClassificao() {
        return (int) pegaMedia() / 2;
    }
}