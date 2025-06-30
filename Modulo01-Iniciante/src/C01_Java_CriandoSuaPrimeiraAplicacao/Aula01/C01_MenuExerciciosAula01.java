package C01_Java_CriandoSuaPrimeiraAplicacao.Aula01;

import C01_Java_CriandoSuaPrimeiraAplicacao.C01_MenuPrincipal;
import Util.MensagemDespedida;

import java.util.Scanner;

public class C01_MenuExerciciosAula01 {

    public void MenuExerciciosAula01() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("""
                    \n
                    |================Aula 01================|
                    |                                       |
                    |---Digito---|--------Exercício---------|
                    |            |                          |
                    |     1      |       Exercício 01       |
                    |     2      |       Exercício 02       |
                    |     3      |       Exercício 03       |
                    |     4      |       Exercício 04       |
                    |     5      |       Exercício 05       |
                    |     6      |       Exercício 06       |
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
                            
                            Agora é com você! Faça o mesmo procedimento que eu fiz na aula, criando um projeto Java no
                            IntelliJ que deve conter uma classe chamada PrimeiraClasse, com o método main, que ao
                            executar deverá imprimir no console o texto
                            
                            - “Concluí a aula 01 e agora estou mergulhando em Java!” -
                            """);
                    Exercicio01ExibirMens ex01 = new Exercicio01ExibirMens();
                    ex01.exibirMensagem();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("""
                            \n
                            Enunciado:");
                            
                            Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil,
                            com o método main, que ao executar deverá imprimir um cumprimento personalizado no console.
                            
                            Por exemplo: 'Olá, [Seu Nome]!'.
                            """);
                    Exercicio02Perfil ex02 = new Exercicio02Perfil();
                    ex02.exibirNome();
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada.
                            
                            Por exemplo: 'Tudo bem?'
                            """);
                    Exercicio03Cumprimento ex03 = new Exercicio03Cumprimento();
                    ex03.exibirCumprimento();
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe chamada Estudos para imprimir anotações de estudos no console.
                            """);
                    Exercicio04Anotacoes ex04 = new Exercicio04Anotacoes();
                    ex04.exibirAnotacoes();
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5.
                            Certifique-se de que o resultado seja exibido sem o uso de aspas,
                            apresentando o valor '15' ao invés da expressão '10+5'.
                            """);
                    Exercicio05Soma ex05 = new Exercicio05Soma();
                    ex05.Soma();
                    System.out.println(" ");
                    break;

                case 6:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe Subtracao para imprimir o resultado de 10 - 5 no console.
                            """);
                    Exercicio06Subtracao ex06 = new Exercicio06Subtracao();
                    ex06.Subtracao();
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
                    break;

                default:
                    System.out.println("\nDigite um número que esteja entre as opções!");
            }

        }
    }
}
