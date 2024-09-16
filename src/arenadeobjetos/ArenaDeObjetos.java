package arenadeobjetos;

import java.util.ArrayList;
import java.util.Scanner;

import model.Guerreiro;
import model.Ladrao;
import model.Pessoa;
import servico.GuerreiroServicos;
import servico.LadraoServicos;
import servico.ServicosFactory;
import servico.VitimasServicos;

public class ArenaDeObjetos {
    static Scanner ler = new Scanner(System.in);
    static int opMP;
    static ArrayList<Guerreiro> guerreiros = new ArrayList<>();
    static ArrayList<Ladrao> ladraos = new ArrayList<>();
    static ArrayList<Pessoa> vitimas = new ArrayList<>();

    public static int lerInt() {
        Scanner ler = new Scanner(System.in);
        int num = 99;
        try {// o que pode dar erro
            num = ler.nextInt();
        } catch (Exception e) {// tratar o erro
            System.out.print("Tente Novamente: ");
            lerInt();
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("< ARENA DE OBJETOS >");
        do {
            menuP();
            subMenuP(opMP);
        } while (opMP != 0);
    }

    public static void menuP() {// menu principal
        String menu;
        menu = "0 - Sair\n"
                + "1 - Criar Personagens \n"
                + "2 - Listar Personagens \n"
                + "3 - Batalha";
        System.out.println(menu);
        System.out.print("Informe sua escolha: ");
        opMP = lerInt();
    }// fim menuP

    public static void subMenuP(int omP) {
        System.out.println(" < SubMenu >");
        String subMenu;
        switch (omP) {
            case 1:
                System.out.print("1 - Guerreiro\n"
                        + "2 - Ladrão\n"
                        + "3 - Vitima\n"
                        + "Digite a opção: ");
                int opMP = lerInt();
                criarPersona(opMP);
                break;
            case 2:
                System.out.println("Lista de Personagens");
                System.out.println(guerreiros.toString());
                System.out.println("Lista bonita");
                for (Guerreiro g : guerreiros) {
                    System.out.println("Nome do Guerreiro: " + g.getNome());
                    System.out.println("Armamento: " + g.getArmamento());
                    System.out.println("Pontos de vida: " + g.getPontosDeVida());
                }
                for (Ladrao l : ladraos) {
                    System.out.println("Nome do ladrão: " + l.getNome());
                    System.out.println("Plano de Fuga: " + l.getPlanoDeFuga());
                    System.out.println("Pontos de vida: " + l.getPontosDeVida());
                }
                for (Pessoa p : vitimas) {
                    System.out.println("Nome da vitima: " + p.getNome());
                    System.out.println("Pontos de vida: " + p.getPontosDeVida());
                }
                System.out.println("Ladrão Ram");
                System.out.println(ladraos.toString());
                System.out.println("Vitima Ram");
                System.out.println(vitimas.toString());
                System.out.println("Vitima Bamco de Dados");

                VitimasServicos vs = ServicosFactory.getVitimasServicos();
                System.out.println(vs.listaVitimas().toString());

                System.out.println(" --Buscar vitima por nome --");
                System.out.println(vs.buscaVitimaByNome("Ian").toString());
                Pessoa vUP = vs.buscaVitimaByNome("%Ian%");

                vUP.setCabelo("Preto");
                vs.atualizarVitima(vUP);
                System.out.println("-- Vítima Atualizada --");
                System.out.println(vs.buscaVitimaByNome("%Ian%").toString());
                System.out.println("- deletar vitima Ana -");
                int id = vs.buscaVitimaByNome("%Ana%").getId();
                if (vs.deletarVitimas(id)) {
                    System.out.println("Vítima deletada");
                } else {
                    System.out.println("Erro ao deletar vítima");
                }

                GuerreiroServicos gs = ServicosFactory.getGuerreiroServicos();
                System.out.println(gs.listaGuerreiros().toString());
                System.out.println(" --Buscar guerreiro por nome -Eli-");
                System.out.println(gs.buscaGuerreirosByNome("Eli").toString());
                Guerreiro gUP = gs.buscaGuerreirosByNome("%Eli%");
                gUP.setCabelo("Preto");
                gs.atualizarGuerreiros(gUP);
                System.out.println("-- Guerreiro Atualizado --");
                System.out.println(gs.buscaGuerreirosByNome("%Bob%").toString());
                System.out.println("- deletar Guerreiro  -");
                int idg = gs.buscaGuerreirosByNome("%Bob%").getId();
                if (gs.deletarGuerreiros(idg)) {
                    System.out.println("Guerreiro deletado");
                } else {
                    System.out.println("Erro ao deletar guerreiro");
                }
                LadraoServicos ls = ServicosFactory.getLadraoServicos();
                System.out.println(ls.listaLadrao().toString());
                System.out.println(" --Buscar ladrao por nome -Luis-");
                System.out.println(ls.buscaLadraoByNome("Luis").toString());
                Ladrao lUP = ls.buscaLadraoByNome("%Luis%");
                lUP.setCabelo("Branco");
                ls.atualizarLadrao(lUP);
                System.out.println("-- Ladrão Atualizado --");
                System.out.println(ls.buscaLadraoByNome("%Wendel%").toString());
                System.out.println("- Deletar ladrao  -");
                int idl = ls.buscaLadraoByNome("%Wendel%").getId();
                if (ls.deletarLadrao(idl)) {
                    System.out.println("Ladrão deletado");
                } else {
                    System.out.println("Erro ao deletar ladrão");
                }
                break;
            case 3:
                break;
            case 0:
                System.out.println("Arena de objeto encerrada pelo usuário");
                break;
            default:
                System.out.println("Opção invalida, tente novamente!");
                menuP();
                break;
        }
    }// fim do switch

    private static void criarPersona(int opSP) {
        switch (opSP) {
            case 1:
                System.out.println(" < Criar Guerreiro >");
                Guerreiro g = new Guerreiro();
                System.out.print("Informe o nome do Guerreiro: ");
                g.setNome(ler.nextLine());
                System.out.print("Informe o cabelo do Guerreiro: ");
                g.setCabelo(ler.nextLine());
                System.out.print("Informe o olho do Guerreiro: ");
                g.setOlho(ler.nextLine());
                System.out.print("Informe a pele do Guerreiro: ");
                g.setPele(ler.nextLine());
                System.out.print("Escolha o sexo do guerreiro\n"
                        + "1 - Feminino\n"
                        + "2 - Masculino\n"
                        + "Digite a opção desejada: ");
                int sexoInt = lerInt();
                boolean sexo = false;
                if (sexoInt == 2) {
                    sexo = true;
                }
                g.setSexo(sexo);
                System.out.println("Informe o armamento do guerreiro: ");
                g.setArmamento(ler.nextLine());
                guerreiros.add(g);
                GuerreiroServicos GS = ServicosFactory.getGuerreiroServicos();
                GS.cadastrarGuerreiro(g);
                break;
            case 2:
                System.out.println(" < Criar Ladrão >");
                Ladrao l = new Ladrao();
                System.out.print("Informe o nome do Ladrão: ");
                l.setNome(ler.nextLine());
                System.out.print("Informe o cabelo do Ladrão: ");
                l.setCabelo(ler.nextLine());
                System.out.print("Informe o olho do Ladrão: ");
                l.setOlho(ler.nextLine());
                System.out.print("Informe a pele do Ladrão: ");
                l.setPele(ler.nextLine());
                System.out.print("Escolha o sexo do Ladrão\n"
                        + "1 - Feminino\n"
                        + "2 - Masculino\n"
                        + "Digite a opção desejada: ");
                int sexoIntL = lerInt();
                boolean sexoL = false;
                if (sexoIntL == 2) {
                    sexo = true;
                }
                l.setSexo(sexoL);
                System.out.println("Informe o plano de fuga do ladrão: ");
                l.setPlanoDeFuga(ler.nextLine());
                ladraos.add(l);
                LadraoServicos LS = ServicosFactory.getLadraoServicos();
                LS.cadastrarLadrao(l);
                break;
            case 3:
                System.out.println("< Criar Vitima >");
                Pessoa p = new Pessoa();
                System.out.print("Informe o nome da Vitima: ");
                p.setNome(ler.nextLine());
                System.out.print("Informe o cabelo da Vitima: ");
                p.setCabelo(ler.nextLine());
                System.out.print("Informe o olho da Vitima: ");
                p.setOlho(ler.nextLine());
                System.out.print("Informe a pele da Vitima: ");
                p.setPele(ler.nextLine());
                System.out.print("Escolha o sexo da Vitima\n"
                        + "1 - Feminino\n"
                        + "2 - Masculino\n"
                        + "Digite a opção desejada: ");
                int sexoIntP = lerInt();
                boolean sexoP = false;
                if (sexoIntP == 2) {
                    sexo = true;
                }
                p.setSexo(sexoP);
                vitimas.add(p);// add vitima numa arraylist
                VitimasServicos VS = ServicosFactory.getVitimasServicos();
                VS.cadastrarVitima(p);
                break;
            default:
                System.out.println("Opção invalida, tente novamente!");
                subMenuP(opSP);
                break;
        }
    }
}