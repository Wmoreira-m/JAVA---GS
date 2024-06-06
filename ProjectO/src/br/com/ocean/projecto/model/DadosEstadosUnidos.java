package br.com.ocean.projecto.model;

public class DadosEstadosUnidos {

    //Atributos da Classe Dados Estados Unidos, onde são dados que drone coleta.
    private String id;
    private double taxaResiduo;
    private double phAgua;
    private String pescaIlegal;
    private double regiaoLixo;
    private String qualidadeAr;
    private String temperaturaAgua;


    //Construtor padrão caso não haja detecções de nada.
    public DadosEstadosUnidos() {
    }


    //Construtor passando todos os atributos.
    public DadosEstadosUnidos(String id, double taxaResiduo, double phAgua, String pescaIlegal, double regiaoLixo, String qualidadeAr, String temperaturaAgua) {
        this.id = id;
        this.taxaResiduo = taxaResiduo;
        this.phAgua = phAgua;
        this.pescaIlegal = pescaIlegal;
        this.regiaoLixo = regiaoLixo;
        this.qualidadeAr = qualidadeAr;
        this.temperaturaAgua = temperaturaAgua;
    }


    //Getters e Setters.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public double getPhAgua() {
        return phAgua;
    }

    public void setPhAgua(double phAgua) {
        this.phAgua = phAgua;
    }

    public String getPescaIlegal() {
        return pescaIlegal;
    }

    public void setPescaIlegal(String pescaIlegal) {
        this.pescaIlegal = pescaIlegal;
    }

    public double getTaxaResiduo() {
        return taxaResiduo;
    }

    public void setTaxaResiduo(double taxaResiduo) {
        this.taxaResiduo = taxaResiduo;
    }

    public double getRegiaoLixo() {
        return regiaoLixo;
    }

    public void setRegiaoLixo(double regiaoLixo) {
        this.regiaoLixo = regiaoLixo;
    }

    public String getQualidadeAr() {
        return qualidadeAr;
    }

    public void setQualidadeAr(String qualidadeAr) {
        this.qualidadeAr = qualidadeAr;
    }

    public String getTemperaturaAgua() {
        return temperaturaAgua;
    }

    public void setTemperaturaAgua(String temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }
}
