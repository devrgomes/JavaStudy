package C01_Java_CriandoSuaPrimeiraAplicacao.C01_ProjetoFinal;

import java.util.Scanner;

public class ProjetoFinal_SistemaBancarioSimples {

        public void ProjetoFinalSysBanc() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                | Seja Bem Vindo ao Sistema do Banco Simplex
                
                | Vamos dar início ao seu cadastro...
                """);
        Thread.sleep(1000);

        //--NOME

        System.out.print("\n| Digite seu nome completo: ");
        String nome = sc.nextLine();

        //--TIPO DA CONTA

        System.out.println("""
                \n| Qual o tipo da sua conta?
                    1 - Conta Corrente
                    2 - Conta Poupanca
                """);

        System.out.print("Digite aqui o tipo da sua conta (1/2): ");
        int tipo = sc.nextInt();

        String tipoConta = "";

        if (tipo == 1) {
            tipoConta = "Corrente";
        } else if (tipo == 2) {
            tipoConta = "Poupança";
        } else {
            System.out.println("Digite um número entre 1 e 2!");
            return; // ou System.exit(0);
        }

        //--SALDO BANCÁRIO INICIAL

        System.out.print("\n| Qual saldo o inicial da sua conta? ");
        double saldo = sc.nextDouble();

        System.out.println("\nEstamos realizando o seu cadastro...");
        Thread.sleep(1500);
        System.out.println("\nEm alguns instantes...");
        Thread.sleep(1000);
        System.out.println("\nCadastro realizado com sucesso! Abaixo estão as suas informações.");

        System.out.printf("""
                        \n
                        |=========Banco Simplex=========
                        |
                        |------Dados da sua Conta
                        |
                        | Nome: %s
                        | Tipo de Conta: %s
                        | Saldo: R$ %.2f
                        |
                        |===============================
                        """,
                nome,
                tipoConta,
                saldo
        );

        int opc = 1;

        while (opc != 0) {
            System.out.println("""
                    |=====Operações da sua Conta=====
                    |
                    | 1 - Consultar saldos
                    | 2 - Receber transferencia
                    | 3 - Realizar transferencia
                    | 4 - Exibir dados da sua Conta
                    |
                    | 0 - Sair
                    |================================
                    \n
                    """);

            System.out.print("Digite a opreção desejada: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.printf("Seu saldo bancário atual é: R$ %.2f", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor a ser recebido: R$ ");
                    double valorRecebido = sc.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Seu novo saldo é: R$ %.2f", saldo);
                    break;

                case 3:
                    System.out.print("Digite o valor a ser transferido: R$ ");
                    double valorTransferido = sc.nextDouble();

                    if (valorTransferido > saldo) {
                        System.out.printf("Saldo insuficiente! Seu saldo atual é R$ %.2f", saldo);
                    } else {
                        saldo -= valorTransferido;
                        System.out.printf("Seu novo saldo é: R$ %.2f", saldo);
                    }
                    break;

                case 4:
                    System.out.printf("""
                        \n
                        |=========Banco Simplex=========
                        |
                        |------Dados da sua Conta
                        |
                        | Nome: %s
                        | Tipo de Conta: %s
                        | Saldo: R$ %.2f
                        |
                        |===============================
                        """,
                            nome,
                            tipoConta,
                            saldo
                    );
                    break;

                case 0:
                    System.out.println("\nFinalizando sistema...");
                    Thread.sleep(1500);
                    System.out.println("""
                                Sistema finalizado com sucesso!
                                Obrigado por usar o Banco Simplex! Volte sempre.
                                """);
                    break;

                default:
                    System.out.println("Digite um número valido!");
            }
        }

    }
}