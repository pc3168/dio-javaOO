package br.com.pc.banco;


import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco("Banco Genérico");

        Cliente clientePaulo = new Cliente();
        clientePaulo.setNome("Paulo César");
        clientePaulo.setDataNascimento("07-05-1987");

        Cliente clienteJoao = new Cliente();
        clienteJoao.setNome("João Paulo");
        clienteJoao.setDataNascimento("07-05-2000");

        Conta cc = new ContaCorrente(clientePaulo);
        Conta poupanca = new ContaPoupanca(clienteJoao);

        cc.consultarSaldo();
        cc.depositar(100);
        cc.transferir(50, poupanca);
        cc.sacar(25);
        cc.consultarSaldo();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        java.util.List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(poupanca);
        banco.setContas(contas);
        System.out.println(banco);
    }

//    Agora é a sua hora de brilhar, use todo seu conhecimento em Java e Orientação a Objetos
//     para evoluir o projeto criado nesta aula. Para isso, seguem algumas sugestões:
//
//    Use todo o seu conhecimento para estender o domínio, incluindo novas classes, atributos e/ou métodos;
//
//    Incluir o Lombok ao projeto para reduzir sua verbosidade de código.
}
