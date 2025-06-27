package C01_Java_CriandoSuaPrimeiraAplicacao.Aula01;

import C01_Java_CriandoSuaPrimeiraAplicacao.C01_MenuPrincipal;

import java.util.Scanner;

public class C01_MenuExerciciosAula01 {

    public void MenuExerciciosAula01() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("""
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

            System.out.print("Escolha qual exercicio você deseja visualizar a resposta e o enunciado: ");
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
                            \n
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
                            \n
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
                            \n
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
                            \n
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
                            \n
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
                            \n
                            """);
                    Exercicio06Subtracao ex06 = new Exercicio06Subtracao();
                    ex06.Subtracao();
                    System.out.println(" ");
                    break;

                case 9:
                    System.out.println("Voltando para o Menu de Aulas...\n");
                    for (int i = 3; i >= 0; i--) {
                        System.out.println("em " + i);
                        Thread.sleep(1000); // pausa por 1 segundo
                    }
                    C01_MenuPrincipal menuPrincipalAulas = new C01_MenuPrincipal();
                    menuPrincipalAulas.mostrarMenuC01();
                    break;

                case 0:
                    System.out.println("Finalizando o programa...");
                    break;

                default:
                    System.out.println("Digite um número que esteja entre as opções!");
            }

        }
    }
}
