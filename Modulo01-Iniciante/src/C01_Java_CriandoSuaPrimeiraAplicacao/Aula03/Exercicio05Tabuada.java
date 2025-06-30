package C01_Java_CriandoSuaPrimeiraAplicacao.Aula03;

import java.util.Scanner;

public class Exercicio05Tabuada {

    public void Tabuada() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int num = sc.nextInt();

        System.out.println("Tabuada do " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}