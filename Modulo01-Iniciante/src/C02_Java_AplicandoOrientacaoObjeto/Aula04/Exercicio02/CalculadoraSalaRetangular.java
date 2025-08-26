package C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio02;

import java.util.Scanner;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    Scanner scan = new Scanner(System.in);

    private double base;
    private double altura;

    public void calculadoraRetangulo(){
        System.out.println("---CalculadoraRetangulo---");
        System.out.println("| Digite o valor da base: ");
        base = scan.nextDouble();
        System.out.println("| Digite o valor da altura: ");
        altura = scan.nextDouble();

        System.out.println("""
                | Você quer calcular
                |
                | 1 - Área do retangulo
                | 2 - Perimetro do retangulo
                """);
        System.out.println("| Digite sua opção: ");
        int opc =  scan.nextInt();

        if(opc == 1){
            System.out.println("Área: " + calcularArea());
        } else if(opc == 2){
            System.out.println("Perímetro: " + calcularPerimetro());
        } else {
            System.out.println("Opção inválida");
        }
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
}