package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio01;

public class ExibeDadosBancarios {

    public void exibeDB(){
        ContaBancaria novaConta = new ContaBancaria();

        novaConta.titular = "João Silva";
        novaConta.setNumeroConta("141253-953");
        novaConta.setSaldo(5000);

        novaConta.exibeDadosBancarios();
    }
}