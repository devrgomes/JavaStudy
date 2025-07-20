package C02_Java_AplicandoOrientacaoObjeto.Aula02.Exercicio01;

public class ContaBancaria {

        private String numeroConta;
        private double saldo;
        public String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void exibeDadosBancarios(){
        System.out.println("Nome do titular da conta: " + this.titular);
        System.out.println("Saldo da conta: " + this.saldo);
        System.out.println("Numero da conta: " + this.numeroConta);
    }
}
