package arenadeobjetos;
import java.util.Scanner;
public class ArenaDeObjetos {
    static Scanner ler = new Scanner(System.in);
    public static int LerInt() {
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
    }
    public static void menuP() {
        String menu;
        menu = "0 - Sair\n"
                + "1 - Criar Personagens \n"
                + "2 - Listar Personagens \n"
                + "3 - Batalha";
        System.out.println(menu);
    }
    public static void subMenuP(int omP) {
        String subMenu;
        switch (omP) {
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                break;
            default:
                break;
        }
    }
}
