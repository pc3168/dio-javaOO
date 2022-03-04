package br.com.pc.banco;

public class SaldoInsulficienteException extends Exception {

    public SaldoInsulficienteException(){
        super("Não é possível sacar um valor maior que o saldo em conta.");
    }
}
