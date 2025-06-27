package C01_Java_CriandoSuaPrimeiraAplicacao;

import C01_Java_CriandoSuaPrimeiraAplicacao.Aula01.C01_MenuExerciciosAula01;
import C01_Java_CriandoSuaPrimeiraAplicacao.Aula02.C01_MenuExerciciosAula02;
import C01_Java_CriandoSuaPrimeiraAplicacao.Aula03.C01_MenuExerciciosAula03;

import java.util.Scanner;

public class C01_MenuPrincipal {

    public void mostrarMenuC01() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("""
                    |========================================|
                    | Java: criando a sua primeira aplicação |
                    |========================================|
                    |                                        |
                    |----Dígito----|-----Correspondente------|
                    |              |                         |
                    |      1       |        Aula 01          |
                    |      2       |        Aula 02          |
                    |      3       |        Aula 03          |
                    |      4       |        Projeto Final    |
                    |              |                         |
                    |----------------------------------------|
                    |      9       |        Voltar           |
                    |      0       |        Sair             |
                    |========================================|
                    """);

            System.out.print("Digite sua escolha: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {

                case 1:
                    C01_MenuExerciciosAula01 menuAula01 = new C01_MenuExerciciosAula01();
                    menuAula01.MenuExerciciosAula01();
                    break;

                case 2:
                    C01_MenuExerciciosAula02 menuAula02 = new C01_MenuExerciciosAula02();
                    menuAula02.MenuExerciciosAula02();
                    break;

                case 3:
                    C01_MenuExerciciosAula03 menuAula03 = new C01_MenuExerciciosAula03();
                    menuAula03.MenuExerciciosAula03();
                    break;

                case 4:
//                    C01_ProjetoFinal pjfC01 = new C01_ProjetoFinal();
//                    pjfC01.ProjetoFinal();
                    break;

                case 9:
                    System.out.println("Voltando para o Menu de Cursos...");
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
