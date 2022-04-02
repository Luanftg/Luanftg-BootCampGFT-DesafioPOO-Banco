package br.com.dio.desafio.banco;

public class ContaPoupanca extends  Conta {

    @Override
    public void imprimirSaldo() {
        System.out.println("=== Movimenta��es Conta Poupan�a ===");
        super.imprimirSaldo();
    }

    @Override
    public void imprimirExtrato() {
        imprimirSaldo();
        super.imprimirExtrato();
    }


}
