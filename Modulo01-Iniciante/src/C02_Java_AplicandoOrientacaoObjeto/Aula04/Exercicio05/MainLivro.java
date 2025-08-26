package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio05;

public class MainLivro {
    public void exibePrecosLivro (){
        Livro livro = new Livro("Java Completo", 100.0, 0.15); // 15% de desconto
        ProdutoFisico produto = new ProdutoFisico("Mouse Gamer", 150.0, 0.10); // 10% de taxa

        System.out.println(livro);
        System.out.println(produto);
    }
}