package C02_Java_AplicandoOrientacaoObjeto.Aula02;

import C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio01.ExibeDadosBancarios;
import C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio02.ExibePessoa;
import C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio03.ExibeProdutoDesconto;
import C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio04.ExibeMediaAluno;
import C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio05.ExibeLivro;
import C02_Java_AplicandoOrientacaoObjeto.C02_MenuPrincipal;
import Util.MensagemDespedida;

import java.util.Scanner;

public class C02_MenuExerciciosAula02 {

    public void MenuExerciciosAula02() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        while (opc != 0) {

            System.out.println("""
                    \n
                    |================Aula 02================|
                    |                                       |
                    |---Digito---|--------Exercício---------|
                    |            |                          |
                    |     1      |       Exercício 01       |
                    |     2      |       Exercício 02       |
                    |     3      |       Exercício 03       |
                    |     4      |       Exercício 04       |
                    |     5      |       Exercício 05       |
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
                            
                            Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado),
                            saldo (privado) e titular (publico). Implemente métodos getters e setters para os
                            atributos privados.
                            """);
                    ExibeDadosBancarios ex01 = new ExibeDadosBancarios();
                    ex01.exibeDB();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("""
                            \n
                            Enunciado:"
                            
                            Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos
                            getters e setters para acessar e modificar esses atributos. Adicione um método
                            verificarIdade que imprime se a pessoa é maior de idade ou não.
                            """);
                    ExibePessoa ex02 = new ExibePessoa();
                    ex02.exibePessoa();
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos
                            getters e setters para acessar e modificar esses atributos. Adicione um método
                            aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
                            """);
                    ExibeProdutoDesconto ex03 = new ExibeProdutoDesconto();
                    ex03.exibirNovoProduto();
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos
                            getters e setters para acessar e modificar esses atributos.
                            Adicione um método calcularMedia que retorna a média das notas do aluno.
                            """);
                    ExibeMediaAluno ex04 = new ExibeMediaAluno();
                    ex04.exibirAlunoMedia();
                    System.out.println(" ");
                    break;

                case 5:
                    System.out.println("""
                            \n
                            Enunciado:
                            
                            Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos
                            getters e setters para acessar e modificar esses atributos.
                            Adicione um método exibirDetalhes que imprime o título e o autor do livro.
                            """);
                    ExibeLivro ex05 = new ExibeLivro();
                    ex05.exibirNovoLivro();
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