package br.com.ocean.projecto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Investimento {

    //Atributo como uma lista para armazer informações de duvidas e investimentos realizados.
    private List<Investimento> listaInvestimentos;

    //Atributos da Classe Duvida.
    private String id;
    private String nome = "Anônimo";
    private String email = "Anônimo"; //Declarando os atributos como anônimos para se não for preenchido.
    private String cpf_cnpj = "Anônimo";
    private double valor;


    //Construtor só com Id e Valor, para um investidor ANÔNIMO.
    public Investimento(String id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    //Construtor com todos os atributos para um investidor COMUM.
    public Investimento(String id, String nome, String email, String cpf_cnpj, double valor) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf_cnpj = cpf_cnpj;
        this.valor = valor;
    }


    //Um construtor onde é criado uma lista com array, instânciando.
    public Investimento() {
        listaInvestimentos = new ArrayList<>();
    }

    //Método registrar Investimento, onde é gerado um ID aleatório e onde os investimentos são registrados e adicionados a lista.
    public void registrarInvestimento(String nome, String email, String cpf_cnpj, double valor) {
        String id = UUID.randomUUID().toString();
        Investimento investimento = new Investimento(id, nome, email, cpf_cnpj, valor);
        listaInvestimentos.add(investimento);
    }


    //Método de Sobrecarga, onde também é gerado o ID aleatório
    // mas não tem todos os parâmetros, só passando o valor para um investidor Anõnimo
    public void registrarInvestimento(double valor){
        id = UUID.randomUUID().toString();
        Investimento investimento = new Investimento(id, valor);
        listaInvestimentos.add(investimento);
    }


    //Método exibir investimentos, onde é exibido todos os investimentos registrados.
    public String exibirInvestimentos() {
        StringBuilder mensagem = new StringBuilder();
        for (Investimento investimento : listaInvestimentos) {
            mensagem.append(investimento.toString()).append("\n\n");
        }
        return mensagem.toString();
    }


    //Método de sobrescrita, é implementado um método de uma classe já existente.
    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "CPF/CNPJ: " + cpf_cnpj + "\n" +
                "Valor: " + valor + "\n";
    }

    //Getters e Setters
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
