package dao;

public class DAOFactory {
    private static VitimaDAO vDAO = new VitimaDAO();

    public static VitimaDAO geVitimaDAO() {
        return vDAO;
    }

    private static GuerreiroDAO gDAO = new GuerreiroDAO();

    public static GuerreiroDAO guerreiroDAO() {
        return gDAO;
    }

    private static LadraoDAO lDAO = new LadraoDAO();

    public static LadraoDAO ladraoDAO() {
        return lDAO;
    }
}
