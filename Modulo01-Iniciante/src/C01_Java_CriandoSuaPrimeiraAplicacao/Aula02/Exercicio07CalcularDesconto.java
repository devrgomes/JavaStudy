package C01_Java_CriandoSuaPrimeiraAplicacao.Aula02;

import java.util.Scanner;

public class Exercicio07CalcularDesconto {

    public void calcularDesconto() {

        int opcDesconto = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do produto sem desconto aplicado: ");
        double precoOriginal = scan.nextDouble();

        System.out.println("""
                Selecione a quantidade de desconto que deseja aplicar:
                
                1 - 10%
                2 - 20%
                3 - 30%
                4 - 40%
                5 - 50%
                6 - 60%
                7 - 70%
                8 - 80%
                9 - 90%
                """);
        opcDesconto = scan.nextInt();

        double percentualDesconto = 0;

        switch (opcDesconto) {
            case 1:
                percentualDesconto = 0.10;
                break;
            case 2:
                percentualDesconto = 0.20;
                break;
            case 3:
                percentualDesconto = 0.30;
                break;
            case 4:
                percentualDesconto = 0.40;
                break;
            case 5:
                percentualDesconto = 0.50;
                break;
            case 6:
                percentualDesconto = 0.60;
                break;
            case 7:
                percentualDesconto = 0.70;
                break;
            case 8:
                percentualDesconto = 0.80;
                break;
            case 9:
                percentualDesconto = 0.90;
                break;
            default:
                System.out.println("Opção inválida! Nenhum desconto aplicado.");
        }

        double valorDesconto = precoOriginal * percentualDesconto;
        double precoFinal = precoOriginal - valorDesconto;

        System.out.printf("Valor do desconto: R$ %.2f", valorDesconto);
        System.out.printf("Valor final do produto com desconto: R$ %.2f", precoFinal);
    }
}

