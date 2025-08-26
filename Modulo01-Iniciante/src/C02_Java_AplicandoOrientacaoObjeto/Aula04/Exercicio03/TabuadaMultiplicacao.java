package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio03;

import java.util.Scanner;

public class TabuadaMultiplicacao implements Tabuada {
    Scanner scan = new Scanner(System.in);

    private int tabuada;

    @Override
    public int mostrarTabuada() {
        System.out.println("Digite um numero para exibir sua tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do: " + tabuada);
        for (int i = 1; i <= 10; i++){
            System.out.println( i + " x " + tabuada + " = " + (i * tabuada));
        }
        return tabuada;
    }
}
