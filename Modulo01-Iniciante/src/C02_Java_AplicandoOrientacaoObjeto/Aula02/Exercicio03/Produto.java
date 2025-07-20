package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio03;

import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(){
        Scanner scan = new Scanner(System.in);
        int desconto = scan.nextInt();

        if (desconto >= 0 && desconto <= 100) {
            this.preco -= this.preco * (desconto / 100.0);
            System.out.println("Desconto aplicado com sucesso.");
        } else {
            System.out.println("Percentual inválido. Informe um valor entre 0 e 100.");
        }
    }
}