package arenadeobjetos;
import java.util.Scanner;
public class ArenaDeObjetos {
    static Scanner ler = new Scanner(System.in);
    static int opMP;
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
        System.out.println( "< ARENA DE OBJETOS >");
        do{
        menuP();
        subMenuP(opMP);
        } while (opMP >= 0);
    }
    public static void menuP() {
        String menu;
        menu = "0 - Sair\n"
                + "1 - Criar Personagens \n"
                + "2 - Listar Personagens \n"
                + "3 - Batalha";
        System.out.println(menu);
        System.out.print("Informe sua escolha: ");
        opMP = LerInt();
        
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
            case 0 :
                System.out.println("Arena de objeto encerrada pelo usuário");
                break;
            default:
                System.out.println("Opção invalida, tente novamente!");
                menuP();
                break;
        }
    }
}
