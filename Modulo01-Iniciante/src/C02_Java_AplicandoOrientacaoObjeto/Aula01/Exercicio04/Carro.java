package C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio04;

import java.time.LocalDate;

public class Carro {

    String modelo;
    int anoDeFabricacao;
    String cor;

    public void exibeFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Cor do carro: " + cor);
        System.out.println("Ano de Fabricação: " + anoDeFabricacao);
        System.out.println("Idade do carro: " + calculoIdadeCarro() + " anos");
    }

    public int calculoIdadeCarro(){
        int anoAtual = LocalDate.now().getYear(); // pega o ano atual do sistema
        return anoAtual - anoDeFabricacao;
    }
}