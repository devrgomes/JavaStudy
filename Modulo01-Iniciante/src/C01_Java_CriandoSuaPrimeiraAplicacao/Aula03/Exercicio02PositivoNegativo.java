package C01_Java_CriandoSuaPrimeiraAplicacao.Aula03;

import java.util.Scanner;

public class Exercicio02PositivoNegativo {

    public void NumeroPositivoNegativo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para verificar se é positivo ou negativo: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.printf("O %d é negativo", num);
        }else if (num > 0) {
            System.out.printf("O %d é positivo", num);
        }else {
            System.out.println("Isto não é um número");
        }
    }
}