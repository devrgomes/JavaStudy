package C02_Java_AplicandoOrientacaoObjeto.Aula01;

import C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio01.ExibeOlaMundo;
import C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio02.ExibeDobro;
import C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio03.ExibeMusica;
import C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio04.ExibeCarro;
import C02_Java_AplicandoOrientacaoObjeto.Aula01.Exercicio05.ExibeAluno;
import C02_Java_AplicandoOrientacaoObjeto.ProjetoDeAula.ExibeFilme;
import C02_Java_AplicandoOrientacaoObjeto.C02_MenuPrincipal;
import Util.MensagemDespedida;

import java.util.Scanner;

public class C02_MenuExerciciosAula01 {

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
                            
                            Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
                            """);
                    ExibeOlaMundo ex01 = new ExibeOlaMundo();
                    ex01.exibeOlaMundo();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("""
                            \n
                            Enunciado:");
                            
                            Crie uma classe Calculadora com um método que recebe um número como parâmetro
                            e retorna o dobro desse número.
                            """);
                    ExibeDobro ex02 = new ExibeDobro();
                    ex02.exibeDobro();
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe Musica com atributos titulo, artista, anoLancamento,
                            avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música
                            e calcular a média de avaliações.
                            """);
                    ExibeMusica ex03 = new ExibeMusica();
                    ex03.exibeMusica();
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica
                            e calcular a idade do carro.
                            """);
                    ExibeCarro ex04 = new ExibeCarro();
                    ex04.exibeCarro();
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
                            Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método
                            para exibir as informações.
                            """);
                    ExibeAluno ex05 = new ExibeAluno();
                    ex05.exibeAluno();
                    System.out.println(" ");
                    break;

                case 9:
                    System.out.println("\nVoltando para o Menu de Aulas...");
                    for (int i = 3; i >= 0; i--) {
                        System.out.println("em " + i);
                        Thread.sleep(1000);
                    }
                    C02_MenuPrincipal menuPrincipalAulas = new C02_MenuPrincipal();
                    menuPrincipalAulas.mostrarMenuC02();
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
