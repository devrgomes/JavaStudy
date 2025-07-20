package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio04;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }
}