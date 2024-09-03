package arenadeobjetos;

import model.Pessoa;

public class ArenaDeObjetos {
    public static void main(String[] args) {
        Pessoa vitima = new Pessoa(" Vitima 1", " Castanho", " Castanho claro", "Branca", true);
        System.out.println("Vítima 1\n" + vitima.toString());
        System.out.println("Vítima perdeu 25 pontos de vida");
        int pontosAtuais = vitima.getPontosDeVida();
        vitima.setPontosDeVida (pontosAtuais- 25);
        System.out.println("Vitima \n" + vitima.toString());
        vitima.dano(30);
        System.out.println("Vítima perdeu 30 pontos de vida");
        System.out.println("Vitima \n" + vitima.toString());
    }
}
