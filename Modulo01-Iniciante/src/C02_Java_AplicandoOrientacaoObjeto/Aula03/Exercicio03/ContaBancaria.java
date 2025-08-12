package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio03;

public class ContaBancaria {

    protected double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void mostrarDados() {
        System.out.println("=== Dados do Saldo ===");
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("======================");
    }
}