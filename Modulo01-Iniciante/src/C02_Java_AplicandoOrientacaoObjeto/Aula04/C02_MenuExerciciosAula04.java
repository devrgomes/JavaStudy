package C02_Java_AplicandoOrientacaoObjeto.Aula04;

import C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio01.MainCarro;
import C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio02.MainAnimal;
import C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio03.MainCB;
import C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio04.TestePrimos;
import C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio01.ConversorMoeda;
import C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio02.CalculadoraSalaRetangular;
import C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio03.TabuadaMultiplicacao;
import C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio04.ConversorTemperaturaPadrao;
import C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio05.MainLivro;
import C02_Java_AplicandoOrientacaoObjeto.Aula04.Exercicio06.MainPrecoProduto;
import C02_Java_AplicandoOrientacaoObjeto.C02_MenuPrincipal;
import Util.MensagemDespedida;

import java.util.Scanner;

public class C02_MenuExerciciosAula04 {

    public void MenuExerciciosAula04() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("""
                    \n
                    |================Aula 04================|
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
                            
                            Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
                            converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber
                            o valor em dólar como parâmetro.
                            """);
                    ConversorMoeda ex01 = new ConversorMoeda();
                    ex01.converterDolarParaReal();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com
                            os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma
                            sala retangular. A classe deve receber altura e largura como parâmetros.
                            """);
                    CalculadoraSalaRetangular ex02 = new CalculadoraSalaRetangular();
                    ex02.calculadoraRetangulo();
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método
                            mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como
                            parâmetro.
                            """);
                    TabuadaMultiplicacao ex03 = new TabuadaMultiplicacao();
                    ex03.mostrarTabuada();
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e
                            fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa
                            essa interface com as fórmulas de conversão e exibe os resultados.
                            """);
                    ConversorTemperaturaPadrao ex04 = new ConversorTemperaturaPadrao();
                    ex04.conversorTemperatura();
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa
                            interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando
                            descontos ou taxas adicionais.
                            """);
                    MainLivro ex05 = new MainLivro();
                    ex05.exibePrecosLivro();
                    System.out.println(" ");
                    break;

                case 6:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base
                            na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e
                            Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.
                            """);
                    MainPrecoProduto ex06 = new MainPrecoProduto();
                    ex06.exibeServicoProduto();
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