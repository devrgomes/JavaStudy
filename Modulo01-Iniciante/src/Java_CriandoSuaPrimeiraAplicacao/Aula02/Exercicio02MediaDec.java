package Java_CriandoSuaPrimeiraAplicacao.Aula02;

import java.util.Scanner;

public class Exercicio02MediaDec {

    public void MediaDec() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.printf("A média entre as duas notas é %.02f", (nota1+nota2)/2);
    }
}
