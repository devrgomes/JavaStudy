package Aula02;

import java.util.Scanner;

public class Exercicio05CalcValorTotal {

    public void CalculoValorTotal() {

        Scanner scan = new Scanner(System.in);

        double precoProduto;
        int quantidade;

        System.out.println("Suponhamos que você possui um produto e que queira fazer um calculo do valor total deste produto, portanto,\nDigite o valor unitário do seu produto: ");
        precoProduto = scan.nextDouble();
        System.out.println("Digite a quantidade de produtos que você possui: ");
        quantidade = scan.nextInt();
        System.out.printf("De acordo com os dados informados, você possui R$%.02f em produtos.", precoProduto * quantidade);
    }
}
