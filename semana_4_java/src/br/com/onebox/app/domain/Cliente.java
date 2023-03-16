package br.com.onebox.app.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String primeiroNome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private String numero;

    @Column
    private String complemento;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String estado;


    public Cliente(int id,
                   String primeiroNome,
                   String sobrenome,
                   String cpf,
                   String telefone,
                   String rua,
                   String numero,
                   String complemento,
                   String bairro,
                   String cidade,
                   String estado) {
        this.id = ++id;
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;

    }


    public int getId() {
        return id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String mostraNomeCompleto(){
        return "NOME COMPLETO: " + primeiroNome + " " + sobrenome;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "\n" +"Id:" + id +
                "\n" +" PrimeiroNome='" + primeiroNome + '\'' +
                "\n" +" Sobrenome:'" + sobrenome + '\'' +
                "\n" +" Cpf:'" + cpf + '\'' +
                "\n" +" Telefone:'" + telefone + '\'' +
                "\n" +" Rua:'" + rua + '\'' +
                "\n" +" Numero:'" + numero + '\'' +
                "\n" +" Complemento:'" + complemento + '\'' +
                "\n" +" Bairro:'" + bairro + '\'' +
                "\n" +" Cidade:'" + cidade + '\'' +
                "\n" +" Estado:'" + estado;
    }

}
