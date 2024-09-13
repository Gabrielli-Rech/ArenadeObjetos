package servico;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.VitimaDAO;
import model.Pessoa;

public class VitimasServicos {
    VitimaDAO vDAO = DAOFactory.geVitimaDAO();

    public void cadastrarVitima(Pessoa vVO) {
        vDAO.cadastrarVitima(vVO);
    }

    public ArrayList<Pessoa> listaVitimas() {
        return vDAO.getVitmas();
    }

    public Pessoa buscaVitimaByNome(String nome) {
        return vDAO.getVitimasByNome(nome);
    }
    public void atualizarVitima (Pessoa vVO){
        vDAO.atualizarVitima(vVO);
    }

    public boolean deletarVitimas(int id) {
        return vDAO.deletarVitimas(id);
    }
}
