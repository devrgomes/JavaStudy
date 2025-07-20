package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio05;

public class ExibeLivro {

    public void exibirNovoLivro() {
        Livro novoLivro = new Livro();

        novoLivro.setTitulo("A Invenção de Hugo Cabret");
        novoLivro.setAutor("Brian Selznick");

        novoLivro.exibirLivro();
    }
}