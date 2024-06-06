package br.com.ocean.projecto.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Duvida {

    //Atributo como uma lista para armazer informações de duvidas e investimentos realizados.
    private List<Duvida> listaDuvidas;

    //Atributos da Classe Duvida.
    private String id;
    private String email;
    private String nome;
    private String telefone;
    private String comentario;

    //Construtor com todos os atributos.
    public Duvida(String id, String email, String nome, String telefone, String comentario) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.comentario = comentario;
    }


    //Um construtor onde é criado uma lista com array, instânciando.
    public Duvida() {
        listaDuvidas = new ArrayList<>();
    }


    //Método registrar duvida, onde é gerado um ID aleatório e onde as duvidas são registradas e adicionadas a lista.
    public void registrarDuvida(String nome, String email, String telefone, String comentario) {
        String id = UUID.randomUUID().toString(); // Gera um ID aleatório
        Duvida duvida = new Duvida(id, email, nome, telefone, comentario);
        listaDuvidas.add(duvida);
    }

    //Método exibir duvidas, onde é exibido todas as duvidas registradas.
    public String exibirDuvidas() {
        StringBuilder mensagem = new StringBuilder();
        for (Duvida duvida : listaDuvidas) {
            mensagem.append(duvida.toString()).append("\n\n");
        }
        return mensagem.toString();
    }

    //Método de sobrescrita, é implementado um método de uma classe já existente.
    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Telefone: " + telefone + "\n" +
                "Comentário: " + comentario + "\n";
    }

    //Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
