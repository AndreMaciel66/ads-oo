/**
 * Somador
 */
public class Somador {

    private Somador(){};

    private static Somador instancia = null;

    public static Somador getInstance() {
        if (instancia==null){
            instancia = new Somador();
        }
        return instancia;
    };

    public int realizaSoma(int operando_1, int operando_2){
        return operando_1 + operando_2;
    }
    
}