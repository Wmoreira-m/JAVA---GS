package br.com.ocean.projecto.model;


public class Drone {

    //Atributos da Classe Drone.
    private String id;
    private String nome;
    private String modelo;
    private String ano;

    //Construtor padrão.
    public Drone() {
    }

    //Construtor com todos os atributos do drone.
    public Drone(String id, String nome, String modelo, String ano) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }
}
