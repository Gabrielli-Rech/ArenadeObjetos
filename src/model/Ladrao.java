package model;

public class Ladrao extends Pessoa {
    private String planoDefuga;
    public Ladrao (){
    }
    public Ladrao(String nome, String cabelo, String olho, String pele, boolean sexo, String planoDefuga) {
        super(nome, cabelo, olho, pele, sexo);
        this.planoDefuga = planoDefuga;
    }
    public String getPlanoDeFuga (){
        return planoDefuga;
    }
}
