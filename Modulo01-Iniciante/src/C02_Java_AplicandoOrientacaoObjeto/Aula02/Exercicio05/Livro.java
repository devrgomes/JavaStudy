package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio05;

public class Livro {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirLivro() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
    }
}