package C01_Java_CriandoSuaPrimeiraAplicacao.Aula03;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01JogoAdivinhacao {

    public void AdivinharNumero() {
        Scanner chute = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100 + 1);
        int tentativa = 0;

        System.out.println("""
                \nBem-Vindo ao jogo de adivinha o numero secreto!
                Tente adivinhar o número entre 0 e 100!
                Você tem 5 tentativas.
                """);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Tentativa " + i + ": ");
            tentativa = Integer.parseInt(chute.nextLine());

            if (tentativa < numeroAleatorio) {
                System.out.println("O numero é MAIOR que " + tentativa);
            } else if (tentativa > numeroAleatorio) {
                System.out.println("O numero é MENOR que " + tentativa);
            } else {
                System.out.println("Parabens você acertou o número secreto!!!");
                break;
            } if (i == 5) {
                System.out.println("Fim de jogo! Mais sorte da proxima vez );\nO número era: " + numeroAleatorio);
            }
        }
    }
}
