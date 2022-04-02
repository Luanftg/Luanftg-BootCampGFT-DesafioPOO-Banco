package br.com.dio.desafio.banco;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected List<String> extrato = new ArrayList<>();


    private final DateTimeFormatter formatdata = DateTimeFormatter.ofPattern("dd/MM/yyy");

    private static int SEQUENCIAL = 1;
    protected static  final int AGENCIA_PADRAO = 1;



    public void imprimirExtrato(){
        for (int i=0; i<extrato.size();i++) {
            String arr[] = extrato.get(i).split(" ");


            System.out.println("Id:" + i +
                                " Data: " + arr[0]+
                                " Valor: " + arr[1]);
        }

    }

    public void imprimirSaldo() {
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.println("Saldo da conta: " + NumberFormat.getCurrencyInstance().format(this.saldo));
    }

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void addMovtoExtrato(double valor, LocalDate data) {
        this.extrato.add(data.toString() + " " +  valor);
    }

    @Override
    public void movimentacao(double valor, LocalDate data) {
        addMovtoExtrato(valor, data);
        this.saldo += valor;

    }

    @Override
    public void movimentacao(double valor, LocalDate data, Conta contadestino) {
        if (valor > 0) {
            addMovtoExtrato(valor *-1,data);
            this.saldo -= valor;
            contadestino.setSaldo(contadestino.getSaldo() + valor);
            contadestino.addMovtoExtrato(valor,data);
        }
    }
}
