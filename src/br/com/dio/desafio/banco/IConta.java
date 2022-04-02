package br.com.dio.desafio.banco;

import java.time.LocalDate;

public interface IConta {

     void movimentacao(double valor, LocalDate data);

     void movimentacao(double valor, LocalDate data, Conta contadestino);

     void imprimirSaldo();

     void imprimirExtrato();

}
