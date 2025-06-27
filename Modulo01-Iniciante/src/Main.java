import Java_CriandoSuaPrimeiraAplicacao.Aula01.*;
import Java_CriandoSuaPrimeiraAplicacao.Aula02.*;
import Java_CriandoSuaPrimeiraAplicacao.Aula03.Exercicio01JogoAdivinhacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opc = 1;

        System.out.println("""
                \nSeja bem vindo ao código relacionado ao curso 'Java: criando a sua primeira aplicação',
                esse curso é o primeiro do módulo que eu mesmo preparei para o meu estudo, abaixo irei detalhar
                os cursos presentes neste módulo e pretendo manter a mesma base para os seguintes.
                
                Módulo 1 - Jaca Essencial (Iniciante)
                
                x Java: criando a sua primeira aplicação
                - Java: aplicando Orientações ao Objeto
                - Java: trabalhando com listas e coleções de dados
                - Java exceções: aprenda a criar, lançar e controlar exceções
                - Java: consumindo API, gravando e lidando com erros
                - Maven: gerencie dependências e faça o biuld de aplicações Java
                - Java e JDBC: trabalhando com um banco de dados
                
                Objetivos deste módulo:\nDesenvolver aplicações simples, entender a orientação a objetos e introduzir boas práticas.
                
                Projetos a serem realizados ao final dele:
                
                1 - Sistema de Cadastro de Clientes e Pedidos (Console ou Interface Simples)
                
                - Entidades: Cliente, Pedido e Produto.
                - Funcionalidades: criar clientes, adicionar pedidos, gerar resumo de pedidos.
                - Uso forte de orientação a objetos (encapsulamento, herança e polimorfismo).
                
                2 - Gerenciador de Contatos (Console)
                
                - CRUD completo (Create, Read, Update, Delete) de contatos.
                - Salvar os dados em arquivos .txt ou .csv.
                - Uso de manipulação de arquivos, exceções e listas.
                
                3 - Calculadora de Despesas Pessoais (Console)
                
                - Cadastro de categorias (alimentação, transporte, lazer, etc.).
                - Adicionar despesas e gerar relatórios por categoria e por mês.
                - Uso de coleções, enums e regex (para validar entrada de dados).
                
                ______
                
                Espero que goste do que fiz! Aprecie o código.
                """);

        while (opc != 0) {

            System.out.println("""
                    |======================================|
                    |Java: criando a sua primeira aplicação|
                    |======================================|
                    |                                      |
                    |    Selecione o Exercicio Desejado    |
                    |                                      |
                    |======================================|
                    |                                      |
                    |---------------Aula 01----------------|
                    |                                      |
                    |---Dígito---|---Numéro do Exercicio---|
                    |                                      |
                    |     1      |       Exercício 01      |
                    |     2      |       Exercício 02      |
                    |     3      |       Exercício 03      |
                    |     4      |       Exercício 04      |
                    |     5      |       Exercício 05      |
                    |     6      |       Exercício 06      |
                    |                                      |
                    |--------------------------------------|
                    |                                      |
                    |======================================|
                    |                                      |
                    |---------------Aula 02----------------|
                    |                                      |
                    |---Dígito---|---Numéro do Exercicio---|
                    |                                      |
                    |     7      |       Exercício 01      |
                    |     8      |       Exercício 02      |
                    |     9      |       Exercício 03      |
                    |    10      |       Exercício 04      |
                    |    11      |       Exercício 05      |
                    |    12      |       Exercício 06      |
                    |    13      |       Exercício 07      |
                    |                                      |
                    |--------------------------------------|
                    |                                      |
                    |======================================|
                    |                                      |
                    |---------------Aula 03----------------|
                    |                                      |
                    |---Dígito---|---Numéro do Exercicio---|
                    |                                      |
                    |    14      |       Exercício 01      |
                    |                                      |
                    |------====----------------------------|
                    | 0 - Sair                             |
                    |======================================|
                    """);

            System.out.println("Digite sua escolha: ");
            opc = scan.nextInt();

            switch (opc) {

                case 1:
                    System.out.println(" ");
                    Exercicio01ExibirMens ex01 = new Exercicio01ExibirMens();
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
                    Exercicio01CF ex07 = new Exercicio01CF();
                    ex07.CalculadoraCelsiusFahrenheit();
                    System.out.println("Enunciado:");
                    System.out.println("Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.");
                    System.out.println("Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.");
                    System.out.println(" ");
                    break;

                case 8:
                    System.out.println(" ");
                    Exercicio02MediaDec ex08 = new Exercicio02MediaDec();
                    ex08.MediaDec();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Crie um programa que realize a média de duas notas decimais e exiba o resultado.");
                    System.out.println(" ");
                    break;

                case 9:
                    System.out.println(" ");
                    Exercicio03CastingDouble ex09 = new Exercicio03CastingDouble();
                    ex09.CastingDoubleInt();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.");
                    System.out.println(" ");
                    break;

                case 10:
                    System.out.println(" ");
                    Exercicio04CharString ex10 = new Exercicio04CharString();
                    ex10.JuntarCharString();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.");
                    System.out.println(" ");
                    break;

                case 11:
                    System.out.println(" ");
                    Exercicio05CalcValorTotal ex11 = new Exercicio05CalcValorTotal();
                    ex11.CalculoValorTotal();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.");
                    System.out.println(" ");
                    break;

                case 12:
                    System.out.println(" ");
                    Exercicio06RealDolar ex12 = new Exercicio06RealDolar();
                    ex12.ConversorRealDolar();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.");
                    System.out.println(" ");
                    break;

                case 13:
                    System.out.println(" ");
                    Exercicio07CalcularDesconto ex13 = new Exercicio07CalcularDesconto();
                    ex13.calcularDesconto();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).\nCalcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.");
                    System.out.println(" ");
                    break;

                case 14:
                    System.out.println(" ");
                    Exercicio01JogoAdivinhacao ex14 = new Exercicio01JogoAdivinhacao();
                    ex14.AdivinharNumero();
                    System.out.println(" ");
                    System.out.println("Enunciado:");
                    System.out.println("""
                            Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
                            e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
                            A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
                            
                            Dicas:
                            
                            - Para gerar um número aleatório em Java: new Random().nextInt(100);
                            - Utilize o Scanner para obter os dados do usuário;
                            - Utilize uma variável para contar as tentativas;
                            - Utilize um loop para controlar as tentativas;
                            - Utilize a instrução break; para interromper o loop.
                            """);

                case 0:
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