package servico;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.GuerreiroDAO;
import model.Guerreiro;

public class GuerreiroServicos {

    GuerreiroDAO gDAO = DAOFactory.guerreiroDAO();

    public void cadastrarGuerreiro(Guerreiro gVO) {
        gDAO.cadastrarGuerreiro(gVO);
    }

    public ArrayList<Guerreiro> listaGuerreiros() {
        return gDAO.getGuerreiros();
    }

    public Guerreiro buscaGuerreirosByNome(String nome) {
        return gDAO.getGuerreirosByNome(nome);
    }

    public void atualizarGuerreiros(Guerreiro gVO) {
        gDAO.atualizarGuerreiros(gVO);
    }

    public boolean deletarGuerreiros(int id) {
        return gDAO.deletarGuerreiros(id);
    }
}
