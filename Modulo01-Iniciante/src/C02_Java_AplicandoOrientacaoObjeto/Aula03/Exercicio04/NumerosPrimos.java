package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio04;

public class NumerosPrimos {

    public static boolean verificarPrimalidade(int numPrimo) {
        if (numPrimo <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numPrimo); i++) {
            if (numPrimo % i == 0) {
                return false; // encontrou divisor → não é primo
            }
        }
        return true; // se passou no teste → é primo
    }

    public void listarPrimos(int limite) {
        for (int i = 2; i <= limite; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}