package br.com.pc.banco;

public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIADOR = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIADOR++;
        this.cliente = cliente;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsulficienteException {
        if (this.saldo <= valor){
            throw new SaldoInsulficienteException();
        }
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) throws SaldoInsulficienteException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void consultarSaldo(){
        System.out.println(String.format("O seu saldo é : %.2f ", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    protected void imprimirInfoComuns(){
        System.out.println(String.format("Titular: %s ", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d ", this.agencia));
        System.out.println(String.format("Número: %d ", this.numero));
        System.out.println(String.format("Saldo: %.2f ", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
