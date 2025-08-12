package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio04;

public class VerificadorPrimo extends NumerosPrimos{

    public static void verificarSeEhPrimo(int numero){
        if (verificarPrimalidade(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}