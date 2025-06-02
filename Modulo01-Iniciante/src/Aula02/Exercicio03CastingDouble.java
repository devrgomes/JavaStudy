package Aula02;

import java.util.Scanner;

public class Exercicio03CastingDouble {

    public void CastingDoubleInt() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero INTEIRO: ");
        int numInt = scan.nextInt();
        System.out.print("Digite um numero COM CASAS DECIMAIS: ");
        double numDouble = scan.nextDouble();
        int castingDouble = (int) numDouble;
        System.out.printf("Aqui está um exemplo de casting Double - %d - e aqui o número inteiro digitado anteriormente - %d -", castingDouble, numInt);
    }
}
