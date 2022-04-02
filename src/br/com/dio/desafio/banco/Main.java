package br.com.dio.desafio.banco;

import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        LocalDate data1 =  LocalDate.now();
        cc.movimentacao(100, data1 );

        LocalDate data2 = LocalDate.now();
        cc.movimentacao(-50, data2);

        cp.movimentacao(150,data2);
        cp.movimentacao(-50,data2);

        cc.movimentacao(50,data2,cp);

        cp.imprimirSaldo();
        cc.imprimirSaldo();

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
