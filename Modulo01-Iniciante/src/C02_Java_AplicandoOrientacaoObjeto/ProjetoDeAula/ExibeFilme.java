package C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula;

public class ExibeFilme {

    public void exibeFilme(){
        Filme novoFilme = new Filme();
        novoFilme.setNome("O Poderoso Chefão");
        novoFilme.setAnoDeLancamento(1972);
        novoFilme.setDuracaoEmMinutos(175);

        novoFilme.exibeFichaTecnica();
        novoFilme.avalia(8);
        novoFilme.avalia(5);
        novoFilme.avalia(10);
        System.out.println(novoFilme.getSomaDasAvaliacoes());
        System.out.println(novoFilme.getTotalDeAvaliacao());
        System.out.println(novoFilme.pegaMedia());
    }
}