package C01_Java_CriandoSuaPrimeiraAplicacao.Aula03;

import java.util.Scanner;

public class Exercicio03ComparandoNumeros {

    public void ComparandoNumeros(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite um segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são IGUAIS.");
        } else {
            System.out.println("Os números são DIFERENTES.");
            if (num1 > num2) {
                System.out.println("O PRIMEIRO número é MAIOR que o SEGUNDO.");
            } else {
                System.out.println("O SEGUNDO número é MAIOR que o PRIMEIRO.");
            }
        }
    }
}