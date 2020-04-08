
public class Calculadora {

    private Calculadora(){};

    private static Calculadora instancia = null;

    public static Calculadora getInstance(){
        if (instancia==null){
            instancia = new Calculadora();
        }
        return instancia;
    };

    public int realizaOperacao(int modo, int operando_1, int operando_2){
        int resultado = 0;
        switch (modo) {
            case 1:
                resultado = operando_1 + operando_2;
                break;

            case 2:
                resultado = operando_1 - operando_2;
                break;

            case 3:
                resultado = operando_1 * operando_2;
                break;

            case 4:
                resultado = operando_1 / operando_2;
                break;
        
            default:
                break;
        }
        return resultado;
    }

}