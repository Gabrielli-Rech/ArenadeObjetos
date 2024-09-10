package dao;

public class DAOFactory {
    private static VitimaDAO vDAO = new VitimaDAO();

    public static VitimaDAO geVitimaDAO() {
        return vDAO;
    }
}
