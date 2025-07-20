package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio02;

public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade(){
        if (idade >= 18){
            System.out.println("Idade maior que 18, portanto maior de idade");
        } else{
            System.out.println("Menor que 18, portanto menor de idade");
        }
    }

    public void pessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}