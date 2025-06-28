import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int opc = 1;
        String yn;

        System.out.println("""
                \n
                Seja bem vindo ao código relacionado ao curso 'Java: criando a sua primeira aplicação',
                esse curso é o primeiro do módulo que eu mesmo preparei para o meu estudo, abaixo irei detalhar
                os cursos presentes neste módulo e pretendo manter a mesma base para os seguintes.
                
                Módulo 1 - Java Essencial (Iniciante)
                
                - Java: criando a sua primeira aplicação
                - Java: aplicando Orientações ao Objeto
                - Java: trabalhando com listas e coleções de dados
                - Java exceções: aprenda a criar, lançar e controlar exceções
                - Java: consumindo API, gravando e lidando com erros
                - Maven: gerencie dependências e faça o biuld de aplicações Java
                - Java e JDBC: trabalhando com um banco de dados
                
                Objetivos deste módulo:
                
                Desenvolver aplicações simples, entender a orientação a objetos e introduzir boas práticas.
                
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
                
                Espero que goste do que fiz!
                """);

        System.out.print("Podemos prosseguir (y/n) ? ");
        yn = sc.nextLine();

        if (yn.equals("y")){
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
                    |              |                                                                |
                    |----Dígito----|-------------Correspondente-------------------------------------|
                    |              |                                                                |
                    |      1       | Java: criando a sua primeira aplicação                         |
                    |      2       | Java: aplicando Orientações ao Objeto                          |
                    |      3       | Java: trabalhando com listas e coleções de dados               |
                    |      4       | Java exceções: aprenda a criar, lançar e controlar exceções    |
                    |      5       | Java: consumindo API, gravando e lidando com erros             |
                    |      6       | Maven: gerencie dependências e faça o biuld de aplicações Java |
                    |      7       | Java e JDBC: trabalhando com um banco de dados                 |
                    |              |                                                                |
                    |-------------------------------------------------------------------------------|
                    |      9       |        Voltar                                                  |
                    |      0       |        Sair                                                    |
                    |===============================================================================|
                    """);

            System.out.print("Digite sua escolha: ");
            opc = sc.nextInt();

            switch (opc) {



                case 9:

                    break;

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
        } else {
            System.out.println("TE FODE ENTÃO!");
        }
    }
}