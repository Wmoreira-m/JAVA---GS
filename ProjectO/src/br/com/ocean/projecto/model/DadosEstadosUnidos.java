package br.com.ocean.projecto.model;

public class DadosEstadosUnidos {

    private String id;
    private String taxaResiduo;
    private String phAgua;
    private String pescaIlegal;
    private String regiaoLixo;
    private String qualidadeAr;
    private String temperaturaAgua;

    public DadosEstadosUnidos() {
    }

    public DadosEstadosUnidos(String id, String taxaResiduo, String phAgua, String pescaIlegal, String regiaoLixo, String qualidadeAr, String temperaturaAgua) {
        this.id = id;
        this.taxaResiduo = taxaResiduo;
        this.phAgua = phAgua;
        this.pescaIlegal = pescaIlegal;
        this.regiaoLixo = regiaoLixo;
        this.qualidadeAr = qualidadeAr;
        this.temperaturaAgua = temperaturaAgua;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaxaResiduo() {
        return taxaResiduo;
    }

    public void setTaxaResiduo(String taxaResiduo) {
        this.taxaResiduo = taxaResiduo;
    }

    public String getPhAgua() {
        return phAgua;
    }

    public void setPhAgua(String phAgua) {
        this.phAgua = phAgua;
    }

    public String getPescaIlegal() {
        return pescaIlegal;
    }

    public void setPescaIlegal(String pescaIlegal) {
        this.pescaIlegal = pescaIlegal;
    }

    public String getRegiaoLixo() {
        return regiaoLixo;
    }

    public void setRegiaoLixo(String regiaoLixo) {
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
