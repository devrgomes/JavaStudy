package C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio05;

public class ExibeAluno {

    public void exibeAluno(){
        Aluno aluno = new Aluno();
        aluno.nome = "Rian";
        aluno.idade = 22;
        aluno.exibeInformacoes();
    }
}