package arenadeobjetos;

import java.util.Scanner;

public class ArenaDeObjetos {
    static Scanner ler = new Scanner(System.in);
    public static int LerInt (){
        Scanner ler = new Scanner(System.in);
        int num = 99;
        try {
            num = ler.nextInt();
        } catch (Exception e) {
            System.out.print("Tente Novamente! \n");
            LerInt();
        }
        return num;
    }
    public static void main(String[] args) {
        String texto;
        int num;
        System.out.print("Digite seu nome: ");
        texto = ler.nextLine();
        System.out.print("Informe sua idade: ");
        num = LerInt();
    }
}
