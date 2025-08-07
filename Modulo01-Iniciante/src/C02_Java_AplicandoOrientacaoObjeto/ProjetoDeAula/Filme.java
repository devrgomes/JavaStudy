package C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula;

public class Filme extends TItulo{

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    TItulo incluiDiretor =  new TItulo();

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.println("Diretor: " + diretor);
    }
}