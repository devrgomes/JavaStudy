package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio04;

import java.util.Scanner;

public class TestePrimos {

    public void testandoNumPrimos() {
        Scanner sc = new Scanner(System.in);
        VerificadorPrimo verificador = new VerificadorPrimo();
        GeradorPrimo gerador = new GeradorPrimo();

        while (true) {
            System.out.println("""
                                ===== MENU NÚMEROS PRIMOS =====
                                
                                1 - Verificar se é primo
                                2 - Gerar próximo primo
                                3 - Listar primos até um limite
                                0 - Sair
                                """);
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int num1 = sc.nextInt();
                    verificador.verificarSeEhPrimo(num1);
                    break;

                case 2:
                    System.out.print("Digite um número: ");
                    int num2 = sc.nextInt();
                    gerador.gerarProximoPrimo(num2);
                    break;

                case 3:
                    System.out.print("Listar primos até: ");
                    int limite = sc.nextInt();
                    System.out.println("Primos até " + limite + ":");
                    gerador.listarPrimos(limite);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}