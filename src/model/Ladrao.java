package model;

public class Ladrao extends Pessoa {
    private String planoDefuga;

    public Ladrao() {
    }

    public Ladrao(String nome, String cabelo, String olho, String pele, boolean sexo, String planoDefuga) {
        super(nome, cabelo, olho, pele, sexo);
        this.planoDefuga = planoDefuga;
    }

    public String getPlanoDeFuga() {
        return planoDefuga;
    }

    public void setPlanoDeFuga(String planoDeFuga) {
        this.planoDefuga = planoDeFuga;
    }

    public String fugir() {
        return "Da no pé";
    }

    public String roubar() {
        return "Arrastão";
    }

    @Override
    public String toString() {
        return "Ladrao [planoDefuga=" + planoDefuga + ", getPlanoDeFuga()=" + getPlanoDeFuga() + ", getNome()="
                + getNome() + ", fugir()=" + fugir() + ", roubar()=" + roubar() + ", getCabelo()=" + getCabelo()
                + ", getOlho()=" + getOlho() + ", getPele()=" + getPele() + "]";
    }

}
