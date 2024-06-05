package br.com.ocean.projecto.model;


public class Drone {

    private String id;
    private String nome;
    private String modelo;
    private String ano;

    public Drone() {
    }

    public Drone(String id, String nome, String modelo, String ano) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }
}
