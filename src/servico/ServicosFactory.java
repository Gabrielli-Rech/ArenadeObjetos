package servico;

public class ServicosFactory {
    private static VitimasServicos VitimaS = new VitimasServicos();
    public static VitimasServicos getVitimasServicos (){
        return VitimaS;
    }
}
