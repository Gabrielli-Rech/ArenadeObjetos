package servico;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.LadraoDAO;
import model.Ladrao;

public class LadraoServicos {
    LadraoDAO lDAO = DAOFactory.ladraoDAO();

    public void cadastrarLadrao(Ladrao lVO) {
        lDAO.cadastrarLadrao(lVO);
    }

    public ArrayList<Ladrao> listaLadrao() {
        return lDAO.geLadraos();
    }

    public Ladrao buscaLadraoByNome(String nome) {
        return lDAO.getladraoByNome(nome);
    }

    public void atualizarLadrao(Ladrao lVO) {
        lDAO.atualizarLadrao(lVO);
    }

    public boolean deletarLadrao(int id) {
        return lDAO.deletarLadrao(id);
    }
}
