package C01_Java_CriandoSuaPrimeiraAplicacao.Aula01;

import java.util.Scanner;

public class Exercicio02Perfil {

    Scanner scan = new Scanner(System.in);

    public String nome;

    public void exibirNome (){

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Seu nome é " + nome);
    }
}