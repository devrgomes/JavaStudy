package C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio02;

import java.util.Scanner;

public class ExibeDobro {

    public void exibeDobro() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numDigitado = scan.nextDouble();

        Calculadora calc = new Calculadora();
        double resultado = calc.dobrar(numDigitado);

        System.out.printf("O dobro do %.2f é : %.2f", numDigitado, resultado);
    }
}