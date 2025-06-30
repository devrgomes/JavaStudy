package C01_Java_CriandoSuaPrimeiraAplicacao.Aula02;

import C01_Java_CriandoSuaPrimeiraAplicacao.C01_MenuPrincipal;
import Util.MensagemDespedida;

import java.util.Scanner;

public class C01_MenuExerciciosAula02 {

    public void MenuExerciciosAula02() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("""
                    \n
                    |================Aula 02================|
                    |                                       |
                    |---Digito---|--------Exercício---------|
                    |            |                          |
                    |     1      |       Exercício 01       |
                    |     2      |       Exercício 02       |
                    |     3      |       Exercício 03       |
                    |     4      |       Exercício 04       |
                    |     5      |       Exercício 05       |
                    |     6      |       Exercício 06       |
                    |     7      |       Exercício 07       |
                    |            |                          |
                    |---------------------------------------|
                    |     9      |       Voltar             |
                    |     0      |       Sair               |
                    |=======================================|
                    """);

            System.out.print("Digite sua escolha: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
                            Utilize variáveis para representar os valores das temperaturas e imprima no console
                            o valor convertido de Celsius para Fahrenheit.
                            
                            Dica:
                            
                            - A fórmula para converter temperaturas de graus Celsius para Fahrenheit é:
                              (temperatura * 1.8) + 32
                            """);
                    Exercicio01CF ex01 = new Exercicio01CF();
                    ex01.CalculadoraCelsiusFahrenheit();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie um programa que realize a média de duas notas decimais e exiba o resultado.
                            """);
                    Exercicio02MediaDec ex02 = new Exercicio02MediaDec();
                    ex02.MediaDec();
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Declare uma variável do tipo double e uma variável do tipo int.
                            Faça o casting da variável double para int e imprima o resultado.
                            """);
                    Exercicio03CastingDouble ex03 = new Exercicio03CastingDouble();
                    ex03.CastingDoubleInt();
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
                            Atribua valores a essas variáveis e concatene-as em uma mensagem.
                            """);
                    Exercicio04CharString ex04 = new Exercicio04CharString();
                    ex04.JuntarCharString();
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
                            Calcule o valor total multiplicando o preço do produto pela quantidade
                            e apresente o resultado em uma mensagem.
                            """);
                    Exercicio05CalcValorTotal ex05 = new Exercicio05CalcValorTotal();
                    ex05.CalculoValorTotal();
                    System.out.println(" ");
                    break;

                case 6:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Declare uma variável do tipo double valorEmDolares.
                            Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente
                            a 4.94 reais.
                            Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
                            """);
                    Exercicio06RealDolar ex06 = new Exercicio06RealDolar();
                    ex06.ConversorRealDolar();
                    System.out.println(" ");
                    break;

                case 7:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Declare uma variável do tipo double precoOriginal.
                            Atribua um valor em reais a essa variável, representando o preço original de um produto.
                            Em seguida, declare uma variável do tipo double percentualDesconto
                            e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
                            Calcule o valor do desconto em reais, aplique-o ao preço original
                            e imprima o novo preço com desconto.
                            """);
                    Exercicio07CalcularDesconto ex13 = new Exercicio07CalcularDesconto();
                    ex13.calcularDesconto();
                    System.out.println(" ");
                    break;

                case 9:
                    System.out.println("\nVoltando para o Menu de Aulas...");
                    for (int i = 3; i >= 0; i--) {
                        System.out.println("em " + i);
                        Thread.sleep(1000);
                    }
                    C01_MenuPrincipal menuPrincipalAulas = new C01_MenuPrincipal();
                    menuPrincipalAulas.mostrarMenuC01();
                    break;

                case 0:
                    System.out.println("\nFinalizando o programa...");
                    for (int i = 3; i >= 0; i--) {
                        System.out.println("em " + i);
                        Thread.sleep(1000);
                    }
                    MensagemDespedida.Despedida();
                    Thread.sleep(5000);
                    System.exit(0);

                default:
                    System.out.println("\nDigite um número que esteja entre as opções!");
            }
        }
    }
}
