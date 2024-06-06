package br.com.ocean.projecto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Investimento {

    private List<Investimento> listaInvestimentos;
    private String id;
    private String nome = "Anônimo";
    private String email = "Anônimo";
    private String cpf_cnpj = "Anônimo";
    private double valor;


    public Investimento(String id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public Investimento(String id, String nome, String email, String cpf_cnpj, double valor) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf_cnpj = cpf_cnpj;
        this.valor = valor;
    }

    public Investimento() {
        listaInvestimentos = new ArrayList<>();
    }
    public void registrarInvestimento(String nome, String email, String cpf_cnpj, double valor) {

        String id = UUID.randomUUID().toString();
        Investimento investimento = new Investimento(id, nome, email, cpf_cnpj, valor);
        listaInvestimentos.add(investimento);

    }

    public void registrarInvestimentoAnonimo(double valor){
        id = UUID.randomUUID().toString();
        Investimento investimento = new Investimento(id, valor);
        listaInvestimentos.add(investimento);
    }

    public String exibirInvestimentos() {

        // Exibir todas as dúvidas registradas
        StringBuilder mensagem = new StringBuilder();
        for (Investimento investimento : listaInvestimentos) {
            mensagem.append(investimento.toString()).append("\n\n");
        }
        return mensagem.toString();
    }

    public String toString() {
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "CPF/CNPJ: " + cpf_cnpj + "\n" +
                "Valor: " + valor + "\n";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
