package Aula01;

import java.util.Scanner;

public class Exercicio05Soma {

    Scanner scan = new Scanner(System.in);

    public void Soma(){

        System.out.println("Bem-vindo a calculadora de Adição entre 2 números!");

        System.out.println("Digite o primeiro numero: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = scan.nextDouble();
        System.out.println("A soma entre os inteiros é "+ (num1+num2));
    }
}
