package C01_Java_CriandoSuaPrimeiraAplicacao.Aula03;

import java.util.Scanner;

public class Exercicio04CalculadoraArea {

    public void CalculadoraArea() {
        Scanner sc = new Scanner(System.in);

        int opc = 0;

        while (opc != 0) {

            System.out.println("""
                    |------Calculadora de Area------|
                    |                               |
                    | 1 - Calcular Ara do Quadrado  |
                    | 2 - Calcular Ara do Circulo   |
                    |                               |
                    | 0 - Sair da calculadora       |
                    |-------------------------------|
                    """);

            System.out.print("Digite a sua opção: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Digite o valor do lado do quadrado: ");
                    double lado = sc.nextDouble();
                    System.out.printf("Área do quadrado: %.2f", Math.pow(lado, 2));
                    break;

                case 2:
                    System.out.print("Digite o valor do raio do círculo: ");
                    double raio = sc.nextDouble();
                    System.out.printf("Área do círculo: %.2f", Math.PI * Math.pow(raio, 2));
                    break;

                case 0:
                    System.out.println("Saindo!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}