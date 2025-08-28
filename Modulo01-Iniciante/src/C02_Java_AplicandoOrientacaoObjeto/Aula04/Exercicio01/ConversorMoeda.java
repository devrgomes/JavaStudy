package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio01;

import java.util.Scanner;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public double converterDolarParaReal() {
        Scanner scan =  new Scanner(System.in);

        System.out.println("---Conversor Dolar para Real---");
        System.out.println("| Digite o valor que deseja converter: US$ ");
        double realConverter = scan.nextDouble();
        realConverter = realConverter * 5.41;
        System.out.printf("| Valor convertido: R$ %.2f", realConverter);
        return realConverter;
    }
}