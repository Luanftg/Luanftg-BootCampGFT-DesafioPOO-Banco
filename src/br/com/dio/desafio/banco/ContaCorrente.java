package br.com.dio.desafio.banco;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirSaldo() {
        System.out.println("=== Movimentações Conta Corrente ===");
        super.imprimirSaldo();
    }

    @Override
    public void imprimirExtrato() {
        imprimirSaldo();
        super.imprimirExtrato();
    }

}
