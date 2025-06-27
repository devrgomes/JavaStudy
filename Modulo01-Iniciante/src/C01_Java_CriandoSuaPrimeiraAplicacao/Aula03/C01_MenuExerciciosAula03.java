package C01_Java_CriandoSuaPrimeiraAplicacao.Aula03;

import C01_Java_CriandoSuaPrimeiraAplicacao.C01_MenuPrincipal;

import java.util.Scanner;

public class C01_MenuExerciciosAula03 {

    public void MenuExerciciosAula03() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("""
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

            System.out.print("Escolha qual exercicio você deseja visualizar a resposta e o enunciado: ");
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
                            \n
                            """);
                    Exercicio01JogoAdivinhacao ex14 = new Exercicio01JogoAdivinhacao();
                    ex14.AdivinharNumero();
                    System.out.println(" ");
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

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
