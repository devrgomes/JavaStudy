package C01_Java_CriandoSuaPrimeiraAplicacao.Aula01;

import java.util.Scanner;

public class Exercicio03Cumprimento {

    Scanner scan = new Scanner(System.in);

    public String nome;

    public void exibirCumprimento () {

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Olá "+ nome +"! Tudo bem?");
    }
}