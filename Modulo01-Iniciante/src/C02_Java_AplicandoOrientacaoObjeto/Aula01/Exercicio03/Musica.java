package C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio03;

public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;

    public void exibeFichaTecnica(){
        System.out.println("Titulo da Musica: " + titulo);
        System.out.println("Artista da Musica: " + artista);
        System.out.println("Ano de lancamento da Musica: " + anoDeLancamento);
        System.out.println("Numero de Avaliacoes da Musica: " + numAvaliacoes);
        System.out.println("Média de Avaliações da Musica: " + calcularMedia());
    }

    public void avaliarMusica(double nota){
        if (nota >= 0 && nota <= 10){
            somaAvaliacoes += nota;
            numAvaliacoes++;
        } else {
            System.out.println("Nota inválida. Digite um número entre 0 e 10 para avaliar esta Musica.");

        }
    }

    public double calcularMedia(){
        if (numAvaliacoes == 0){
            return 0;
        }
        return somaAvaliacoes / numAvaliacoes;
    }
}