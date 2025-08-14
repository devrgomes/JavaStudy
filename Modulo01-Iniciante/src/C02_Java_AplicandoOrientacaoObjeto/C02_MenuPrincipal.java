package C02_Java_AplicandoOrientacaoObjeto;

import C01_Java_CriandoSuaPrimeiraAplicacao.Aula01.C01_MenuExerciciosAula01;
import C01_Java_CriandoSuaPrimeiraAplicacao.Aula02.C01_MenuExerciciosAula02;
import C01_Java_CriandoSuaPrimeiraAplicacao.Aula03.C01_MenuExerciciosAula03;
import C01_Java_CriandoSuaPrimeiraAplicacao.C01_ProjetoFinal.ProjetoFinal_SistemaBancarioSimples;
import C02_Java_AplicandoOrientacaoObjeto.Aula01.C02_MenuExerciciosAula01;
import C02_Java_AplicandoOrientacaoObjeto.Aula02.C02_MenuExerciciosAula02;
import C02_Java_AplicandoOrientacaoObjeto.Aula03.C02_MenuExerciciosAula03;
import Util.MensagemDespedida;

import java.util.Scanner;

public class C02_MenuPrincipal {

    public void mostrarMenuC02() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("""
                    \n
                    |========================================|
                    | Java: Aplicando a Orientação a Objetos |
                    |========================================|
                    |                                        |
                    |----Dígito----|-----Correspondente------|
                    |              |                         |
                    |      1       |        Aula 01          |
                    |      2       |        Aula 02          |
                    |      3       |        Aula 03          |
                    |      3       |        Aula 04          |
                    |      5       |        Projeto Final    |
                    |      6       |        Projeto Da Aula  |
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
                    C02_MenuExerciciosAula01 menuAula01 = new C02_MenuExerciciosAula01();
                    menuAula01.MenuExerciciosAula01();
                    break;

                case 2:
                    C02_MenuExerciciosAula02 menuAula02 = new C02_MenuExerciciosAula02();
                    menuAula02.MenuExerciciosAula02();
                    break;

                case 3:
                    C02_MenuExerciciosAula03 menuAula03 = new C02_MenuExerciciosAula03();
                    menuAula03.MenuExerciciosAula03();
                    break;

//                case 4:
//                    C02_MenuExerciciosAula04 menuAula04 = new C02_MenuExerciciosAula03();
//                    menuAula04.MenuExerciciosAula03();
//                    break;
//
//                case 5:
//                    ProjetoFinal_ pjfC02 = new ProjetoFinal_();
//                    pjfC02.ProjetoFinal;
//                    break;

                case 6:

                    break;

                case 9:
                    System.out.println("\nVoltando para o Menu de Cursos...");
                    for (int i = 3; i >= 0; i--) {
                        System.out.println("em " + i);
                        Thread.sleep(1000);
                    }
                    return;

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
