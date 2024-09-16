package servico;

public class ServicosFactory {
    private static VitimasServicos VitimaS = new VitimasServicos();

    public static VitimasServicos getVitimasServicos() {
        return VitimaS;
    }

    private static GuerreiroServicos GuerreiroS = new GuerreiroServicos();

    public static GuerreiroServicos getGuerreiroServicos() {
        return GuerreiroS;
    }

    private static LadraoServicos LadraoS = new LadraoServicos();

    public static LadraoServicos getLadraoServicos() {
        return LadraoS;
    }
}
