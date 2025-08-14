package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio01;

public class MainCarro {

    public void mainCarro(){
        ModeloCarro carro1 = new ModeloCarro("Honda Civic", 95000, 98000, 102000);
        ModeloCarro carro2 = new ModeloCarro("Toyota Corolla", 97000, 99000, 105000);

        carro1.exibirFichaTecnica();
        carro2.exibirFichaTecnica();
    }
}