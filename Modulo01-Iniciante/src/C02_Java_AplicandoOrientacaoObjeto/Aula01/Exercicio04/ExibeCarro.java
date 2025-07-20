package C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio04;

public class ExibeCarro {

    public void exibeCarro(){
        Carro carro = new Carro();

        carro.modelo = "Pegeout 208";
        carro.anoDeFabricacao = 2021;
        carro.cor = "Azul";

        carro.exibeFichaTecnica();
    }
}