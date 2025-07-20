package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio04;

import java.util.Scanner;

public class ExibeMediaAluno {

    public void exibirAlunoMedia() {
        Scanner scan = new Scanner(System.in);
        Aluno novoAluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        novoAluno.setNome(scan.nextLine());

        System.out.print("Quantas notas deseja informar? ");
        int quantidadeNotas = scan.nextInt();

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.printf("Digite a nota %d: ", i);
            double nota = scan.nextDouble();
            novoAluno.adicionarNota(nota);
        }

        double media = novoAluno.calcularMedia();
        System.out.printf("A média das notas do %s é: %.2f", novoAluno.getNome(), media);
    }
}