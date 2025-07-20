package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio02;

public class ExibePessoa {

    public void exibePessoa(){
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Jonas Duarte");
        pessoa.setIdade(18);

        pessoa.pessoa();
        pessoa.verificaIdade();
    }
}