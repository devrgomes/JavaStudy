package C01_Java_CriandoSuaPrimeiraAplicacao.Aula03;

import java.util.Scanner;

public class Exercicio06ParImpar {

    public void ParOrImpar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é par ou impar: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O número %d é PAR", num);
        } else {
            System.out.printf("O número %d é IMPAR", num);
        }
    }
}