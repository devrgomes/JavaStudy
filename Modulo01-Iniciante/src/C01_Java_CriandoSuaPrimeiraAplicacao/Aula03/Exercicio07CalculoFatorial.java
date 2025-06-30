package C01_Java_CriandoSuaPrimeiraAplicacao.Aula03;

import java.util.Scanner;

public class Exercicio07CalculoFatorial {

    public void CalculoFatorial() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para realizar o calculo fatorial: ");
        int num = sc.nextInt();

        long fatorial = 1;

        if (num < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.printf("O fatorial de %d é: %d", num, fatorial);
        }
    }
}