package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio04;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    Scanner scan = new Scanner(System.in);

    private double celsius;
    private double fahrenheit;

    public void conversorTemperatura() {
        System.out.println("""
                ---Conversor de Temperatura---
                |
                | Você quer converter
                |
                | 1 - Celsius para Fahrenheit
                | 2 - Fahrenheit para Celsius
                """);
        System.out.println("| Digite sua opção: ");
        int opc =  scan.nextInt();
        double resultado;

        if (opc == 1) {
            resultado = celsiusParaFahrenheit();
            System.out.println("Resultado: " + resultado + " °F");
        } else if (opc == 2) {
            resultado = fahrenheitParaCelsius();
            System.out.println("Resultado: " + resultado + " °C");
        } else {
            System.out.println("Número inválido");
        }
    }

    public double celsiusParaFahrenheit() {
        System.out.println("| Digite o temperatura em Celsius: ");
        celsius = scan.nextDouble();
        return (celsius * 9/5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        System.out.println("| Digite o temperatura em Fahrenheit: ");
        fahrenheit = scan.nextDouble();
        return (fahrenheit - 32) * 5/9;
    }
}