package br.com.pc.banco;

public interface IConta {

    void depositar(double valor);

    void sacar(double valor) throws SaldoInsulficienteException;

    void transferir(double valor, Conta contaDestino) throws SaldoInsulficienteException;

    void imprimirExtrato();

    void consultarSaldo();

}
