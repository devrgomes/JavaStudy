package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio03;

import java.util.Scanner;

public class MainCB {

    public void MainConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Configuração da Conta Corrente ===");
        System.out.print("Digite o valor da tarifa mensal: ");
        double tarifa = scanner.nextDouble();

        ContaCorrente conta = new ContaCorrente();
        conta.setTarifaMensal(tarifa);

        int opc = 1;

        while (opc != 0) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Cobrar tarifa mensal");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    break;
                case 4:
                    conta.cobrarTarifeMensal();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}