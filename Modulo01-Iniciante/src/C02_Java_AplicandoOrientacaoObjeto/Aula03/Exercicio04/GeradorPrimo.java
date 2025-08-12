package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio04;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int numero){
        int proximo = numero + 1;

        while (!verificarPrimalidade(proximo)) {
            proximo++;
        }
        System.out.println("O próximo número primo após " + numero + " é: " + proximo);
        return proximo;
    }
}