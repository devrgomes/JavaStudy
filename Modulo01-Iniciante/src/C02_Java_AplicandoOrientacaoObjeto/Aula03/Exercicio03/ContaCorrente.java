package C02_Java_AplicandoOrientacaoObjeto.Aula03.Exercicio03;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifeMensal() {
        if (tarifaMensal <= saldo) {
            saldo -= tarifaMensal;
            System.out.println("Tarifa mensal de R$ " + tarifaMensal + "cobrada com sucesso");
        } else {
            System.out.println("Saldo insuficiente para cobrança da tarifa mensal");
        }
    }
}