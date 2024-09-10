package servico;

import dao.DAOFactory;
import dao.VitimaDAO;
import model.Pessoa;

public class VitimasServicos {
    public void cadastrarVitima(Pessoa vVO) {
        VitimaDAO vDAO = DAOFactory.geVitimaDAO();
        vDAO.cadastrarVitima(vVO);
    }
}
