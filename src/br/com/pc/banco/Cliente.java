package br.com.pc.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private static Long INCREMENTO = 1L;
    private Long id;
    private String nome;
    private java.util.Date dataNascimento;

    public Cliente(){
        this.id = this.INCREMENTO++;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        this.dataNascimento = new SimpleDateFormat("dd-MM-yyyy").parse(dataNascimento);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + new SimpleDateFormat("dd-MM-yyyy").format(dataNascimento) +
                '}';
    }
}
