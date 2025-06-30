package C01_Java_CriandoSuaPrimeiraAplicacao.Aula03;

import C01_Java_CriandoSuaPrimeiraAplicacao.C01_MenuPrincipal;
import Util.MensagemDespedida;

import java.util.Scanner;

public class C01_MenuExerciciosAula03 {

    public void MenuExerciciosAula03() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("""
                    \n
                    |================Aula 03================|
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
                            
                            Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório
                            entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
                            A cada tentativa, o programa deve informar se o número digitado pelo usuário
                            é maior ou menor do que o número gerado.
                            
                            Dicas:
                            
                            - Para gerar um número aleatório em Java: new Random().nextInt(100);
                            - Utilize o Scanner para obter os dados do usuário;
                            - Utilize uma variável para contar as tentativas;
                            - Utilize um loop para controlar as tentativas;
                            - Utilize a instrução break; para interromper o loop.
                            """);
                    Exercicio01JogoAdivinhacao ex01 = new Exercicio01JogoAdivinhacao();
                    ex01.AdivinharNumero();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie um programa que solicite ao usuário digitar um número.
                            Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
                            """);
                    Exercicio02PositivoNegativo ex02 = new Exercicio02PositivoNegativo();
                    ex02.NumeroPositivoNegativo();
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma
                            mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
                            """);
                    Exercicio03ComparandoNumeros ex03 = new Exercicio03ComparandoNumeros();
                    ex03.ComparandoNumeros();
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie um menu que oferece duas opções ao usuário:
                            "1. Calcular área do quadrado" e "2. Calcular área do círculo".
                            Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
                            """);
                    Exercicio04CalculadoraArea ex04 = new Exercicio04CalculadoraArea();
                    ex04.CalculadoraArea();
                    break;

                case 5:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
                            """);
                    Exercicio05Tabuada ex05 = new Exercicio05Tabuada();
                    ex05.Tabuada();
                    break;

                case 6:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie um programa que solicite ao usuário a entrada de um número inteiro.
                            Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
                            """);
                    Exercicio06ParImpar ex06 = new Exercicio06ParImpar();
                    ex06.ParOrImpar();
                    break;

                case 7:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
                            """);
                    Exercicio07CalculoFatorial ex07 = new Exercicio07CalculoFatorial();
                    ex07.CalculoFatorial();
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