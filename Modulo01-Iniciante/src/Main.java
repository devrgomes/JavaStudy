import Aula01.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opc = 0;

        while (opc != 7) {

            System.out.println("----------------------------------");
            System.out.println("| Selecione o Exercicio Desejado |");
            System.out.println("----------------------------------");
            System.out.println("                                  ");
            System.out.println(" 1 - Exercício 01                 ");
            System.out.println(" 2 - Exercício 02                 ");
            System.out.println(" 3 - Exercício 03                 ");
            System.out.println(" 4 - Exercício 04                 ");
            System.out.println(" 5 - Exercício 05                 ");
            System.out.println(" 6 - Exercício 06                 ");
            System.out.println("                                  ");
            System.out.println(" 7 - Sair                         ");
            System.out.println("                                  ");
            System.out.println("----------------------------------");

            System.out.println("Digite sua escolha: ");
            opc = scan.nextInt();

            switch (opc) {

                case 1:
                    System.out.println(" ");
                    Exercicio01 ex01 = new Exercicio01();
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