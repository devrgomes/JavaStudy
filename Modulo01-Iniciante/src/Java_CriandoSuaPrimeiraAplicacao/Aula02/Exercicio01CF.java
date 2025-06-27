package Java_CriandoSuaPrimeiraAplicacao.Aula02;

import java.util.Scanner;

public class Exercicio01CF {

    public void CalculadoraCelsiusFahrenheit() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em Celsius para converter em Fahrenheit: ");
        double Celsius = scan.nextDouble();

        double Fahrenheit = (Celsius * 1.8) + 32;

        System.out.printf(
                """
                
                Conversão de Temperatura:
                --------------------------
                Celsius:     %.2f°C
                Fahrenheit:  %.2f°F
                Fahrenheit (inteiro): %d°F
                --------------------------%n
                """,
                Celsius,
                Fahrenheit,
                (int) Fahrenheit
        );
    }
}
