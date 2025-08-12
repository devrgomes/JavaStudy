package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio01;

public class ModeloCarro extends Carro{

    public ModeloCarro(String nomeModelo, double precoAno1, double precoAno2, double precoAno3) {
        setNomeModelo(nomeModelo);
        setPrecoAno(precoAno1, precoAno2, precoAno3);
    }
}