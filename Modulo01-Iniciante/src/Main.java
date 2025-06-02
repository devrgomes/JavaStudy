import Aula01.*;
import Aula02.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("------------------------------------");
            System.out.println("|  Selecione o Exercicio Desejado  |");
            System.out.println("|----------------------------------|");
            System.out.println("|                                  |");
            System.out.println("|-------------Aula 01--------------|");
            System.out.println("|                                  |");
            System.out.println("|-Dígito---|---Numéro do Exercicio-|");
            System.out.println("|                                  |");
            System.out.println("|    1     |      Exercício 01     |");
            System.out.println("|    2     |      Exercício 02     |");
            System.out.println("|    3     |      Exercício 03     |");
            System.out.println("|    4     |      Exercício 04     |");
            System.out.println("|    5     |      Exercício 05     |");
            System.out.println("|    6     |      Exercício 06     |");
            System.out.println("|----------------------------------|");
            System.out.println("|                                  |");
            System.out.println("|-------------Aula 02--------------|");
            System.out.println("|                                  |");
            System.out.println("|-Dígito---|---Numéro do Exercicio-|");
            System.out.println("|                                  |");
            System.out.println("|    7     |      Exercício 01     |");
            System.out.println("|    8     |      Exercício 02     |");
            System.out.println("|    9     |      Exercício 03     |");
            System.out.println("|   10     |      Exercício 04     |");
            System.out.println("|   11     |      Exercício 05     |");
            System.out.println("|   12     |      Exercício 06     |");
            System.out.println("|----------------------------------|");
            System.out.println("| 0 - Sair                         |");
            System.out.println("------------------------------------");

            System.out.println("Digite sua escolha: ");
            opc = scan.nextInt();

            switch (opc) {

                case 1:
                    System.out.println(" ");
                    Exercicio01ExibirMens ex01 = new Exercicio01ExibirMens();
                    ex01.exibirMensagem();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Agora é com você! Faça o mesmo procedimento que eu fiz na aula, criando um projeto Java no IntelliJ que deve conter uma classe chamada PrimeiraClasse, com o método main, que ao executar deverá imprimir no console o texto “Concluí a aula 01 e agora estou mergulhando em Java!”.");
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println(" ");
                    Exercicio02Perfil ex02 = new Exercicio02Perfil();
                    ex02.exibirNome();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, \"Olá, [Seu Nome]!\".");
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println(" ");
                    Exercicio03Cumprimento ex03 = new Exercicio03Cumprimento();
                    ex03.exibirCumprimento();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, \"Tudo bem?\".");
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println(" ");
                    Exercicio04Anotacoes ex04 = new Exercicio04Anotacoes();
                    ex04.exibirAnotacoes();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Crie uma classe chamada Estudos para imprimir anotações de estudos no console.");
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println(" ");
                    Exercicio05Soma ex05 = new Exercicio05Soma();
                    ex05.Soma();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor \"15\" ao invés da expressão \"10+5\".");
                    System.out.println(" ");
                    break;

                case 6:
                    System.out.println(" ");
                    Exercicio06Subtracao ex06 = new Exercicio06Subtracao();
                    ex06.Subtracao();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Crie uma classe Subtracao para imprimir o resultado de 10 - 5 no console.");
                    System.out.println(" ");
                    break;

                case 7:
                    System.out.println(" ");
                    Exercicio01CF ex07 = new Exercicio01CF();
                    ex07.CalculadoraCelsiusFahrenheit();
                    System.out.println("Enunciado:");
                    System.out.println("Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.");
                    System.out.println("Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.");
                    System.out.println(" ");
                    break;

                case 8:
                    System.out.println(" ");
                    Exercicio02MediaDec ex08 = new Exercicio02MediaDec();
                    ex08.MediaDec();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Crie um programa que realize a média de duas notas decimais e exiba o resultado.");
                    System.out.println(" ");
                    break;

                case 9:
                    System.out.println(" ");
                    Exercicio03CastingDouble ex09 = new Exercicio03CastingDouble();
                    ex09.CastingDoubleInt();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.");
                    System.out.println(" ");
                    break;

                case 10:
                    System.out.println(" ");
                    Exercicio04CharString ex10 = new Exercicio04CharString();
                    ex10.JuntarCharString();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.");
                    System.out.println(" ");
                    break;

                case 11:
                    System.out.println(" ");
                    Exercicio05CalcValorTotal ex11 = new Exercicio05CalcValorTotal();
                    ex11.CalculoValorTotal();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.");
                    System.out.println(" ");
                    break;

                case 0:
                    System.out.println(" ");
                    System.out.println("Saindo");
                    System.out.println(" ");
                    break;

                default:
                    System.out.println(" ");
                    System.out.println("Digite um número valido.");
                    System.out.println(" ");
            }
        }

    }
}