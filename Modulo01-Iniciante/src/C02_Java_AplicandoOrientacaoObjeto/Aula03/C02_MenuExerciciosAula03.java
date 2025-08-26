package C02_Java_AplicandoOrientacaoObjeto.Aula03;

import C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio01.MainCarro;
import C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio02.MainAnimal;
import C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio03.MainCB;
import C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio04.TestePrimos;
import C02_Java_AplicandoOrientacaoObjeto.C02_MenuPrincipal;
import Util.MensagemDespedida;

import java.util.Scanner;

public class C02_MenuExerciciosAula03 {

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
                            
                            Crie uma classe Carro com métodos para representar um modelo específico ao longo de três
                            anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e
                            calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar
                            instâncias específicas, utilizando-a na classe principal para definir preços e mostrar
                            informações.
                            """);
                    MainCarro ex01 = new MainCarro();
                    ex01.mainCarro();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("""
                            \n
                            Enunciado:"
                            
                            Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses:
                            Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses,
                            utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso,
                            adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e
                            arranharMoveis() para o Gato.
                            """);
                    MainAnimal ex02 = new MainAnimal();
                    ex02.mainAnimal();
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe ContaBancaria com métodos para realizar operações bancárias como
                            depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que
                            herda da classe ContaBancaria. Adicione um método específico para a subclasse,
                            como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
                            """);
                    MainCB ex03 = new MainCB();
                    ex03.MainConta();
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos().
                            Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe
                            NumerosPrimos. Adicione um método específico para cada uma das subclasses, como
                            verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
                            """);
                    TestePrimos ex04 = new TestePrimos();
                    ex04.testandoNumPrimos();
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