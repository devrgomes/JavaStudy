import C01_Java_CriandoSuaPrimeiraAplicacao.C01_MenuPrincipal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int opc = 1;
        String yn;

        System.out.println("""
                \n
                Seja bem vindo ao código relacionado ao meu primeiro módulo de estudos de Java, que eu mesmo preparei
                para o meu estudo, abaixo irei detalhar os cursos e projetos presentes neste módulo, pretendo manter a
                mesma base para os seguintes módulos que irei estudar.
                
                Módulo 1 - Java Essencial (Iniciante)
                
                    - Java: criando a sua primeira aplicação
                    - Java: aplicando Orientações ao Objeto
                    - Java: trabalhando com listas e coleções de dados
                    - Java exceções: aprenda a criar, lançar e controlar exceções
                    - Java: consumindo API, gravando e lidando com erros
                    - Maven: gerencie dependências e faça o biuld de aplicações Java
                    - Java e JDBC: trabalhando com um banco de dados
                
                ° Objetivos deste módulo:
                
                    Desenvolver aplicações simples, entender a orientação a objetos e introduzir boas práticas.
                
                ° Projetos a serem realizados ao final dele:
                
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
                
                Espero que goste do que fiz!
                """);

        System.out.print("Podemos prosseguir (y/n) ? ");
        yn = sc.nextLine();

        if (yn.equals("y")) {
            System.out.println(" ");
            for (int i = 5; i >= 0; i--) {
                System.out.println("em " + i);
                Thread.sleep(1000); // pausa por 1 segundo
            }
            System.out.println("\nAprecie o código.\n");

            while (opc != 0) {

                System.out.println("""
                        |===============================================================================|
                        |                   Módulo 01 - Java Essencial (Iniciante)                      |
                        |===============================================================================|
                        |                                                                               |
                        |----Dígito----|-------------Curso Correspondente-------------------------------|
                        |              |                                                                |
                        |      1       | Java: criando a sua primeira aplicação                         |
                        |      2       | Java: aplicando Orientações ao Objeto                          |
                        |      3       | Java: trabalhando com listas e coleções de dados               |
                        |      4       | Java exceções: aprenda a criar, lançar e controlar exceções    |
                        |      5       | Java: consumindo API, gravando e lidando com erros             |
                        |      6       | Maven: gerencie dependências e faça o biuld de aplicações Java |
                        |      7       | Java e JDBC: trabalhando com um banco de dados                 |
                        |              |                                                                |
                        |----Dígito----|-------------Projeto Correspondente-----------------------------|
                        |              |                                                                |
                        |      8       | Projeto 1 - Sistema de Cadastro de Clientes e Pedidos          |
                        |      9       | Projeto 2 - Gerenciador de Contatos                            |
                        |      10      | Projeto 3 - Calculadora de Despesas Pessoais                   |
                        |              |                                                                |
                        |-------------------------------------------------------------------------------|
                        |      0       |        Sair                                                    |
                        |===============================================================================|
                        """);

                System.out.print("Digite sua escolha: ");
                opc = sc.nextInt();

                switch (opc) {

                    case 1:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
                        C01_MenuPrincipal C01menuPrincipal = new C01_MenuPrincipal();
                        C01menuPrincipal.mostrarMenuC01();
                        break;

                    case 2:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
//                        C02_MenuPrincipal C02menuPrincipal = new C02_MenuPrincipal();
//                        C02menuPrincipal.mostrarMenuC02();
                        break;

                    case 3:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
//                        C03_MenuPrincipal C03menuPrincipal = new C03_MenuPrincipal();
//                        C03menuPrincipal.mostrarMenuC03();
                        break;

                    case 4:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
//                        C04_MenuPrincipal C04menuPrincipal = new C04_MenuPrincipal();
//                        C04menuPrincipal.mostrarMenuC04();
                        break;

                    case 5:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
//                        C05_MenuPrincipal C05menuPrincipal = new C05_MenuPrincipal();
//                        C05menuPrincipal.mostrarMenuC05();
                        break;

                    case 6:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
//                        C06_MenuPrincipal C06menuPrincipal = new C06_MenuPrincipal();
//                        C06menuPrincipal.mostrarMenuC06();
                        break;

                    case 7:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
//                        C07_MenuPrincipal C07menuPrincipal = new C07_MenuPrincipal();
//                        C07menuPrincipal.mostrarMenuC07();
                        break;

                    case 8:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
//                        M01_Projeto01_SistemaCadastros M01P01 = new M01_Projeto01_SistemaCadastros();
//                        M01P01.M01P01SistemaCadastro();
                        break;

                    case 9:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
//                        M01_Projeto02_GerenciamentoContatos M01P02 = new M01_Projeto02_GerenciamentoContatos();
//                        M01P02.M01P02GerenciamentoContatos();
                        break;

                    case 10:
                        System.out.println("\nRedirecionando a sua escolha\n");
                        for (int i = 3; i >= 0; i--) {
                            System.out.println("em " + i);
                            Thread.sleep(1000); // pausa por 1 segundo
                        }
//                        M01_Projeto03_CalculadoraDespesasPessoais M01P03 = new M01_Projeto03_CalculadoraDespesasPessoais();
//                        M01P03.M01P03CalculadoraDespesasPessoais();
                        break;

                    case 0:
                        System.out.println("\nFinalizando o programa...");
                        break;

                    default:
                        System.out.println("\nDigite um número que esteja entre as opções!");
                }
            }
        } else {
            System.out.println("TE FODE ENTÃO!");
        }
    }
}