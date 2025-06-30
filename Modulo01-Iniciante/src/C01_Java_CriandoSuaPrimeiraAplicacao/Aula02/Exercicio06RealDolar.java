package C01_Java_CriandoSuaPrimeiraAplicacao.Aula02;

import java.util.Scanner;

public class Exercicio06RealDolar {

    public void ConversorRealDolar() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de dolares que você deseja converter em reais: ");
        double valoremDolar = scan.nextDouble();
        System.out.printf("O valor que você possui poder ser convertido em %.2f dolares", valoremDolar * 4.94);
    }
}
