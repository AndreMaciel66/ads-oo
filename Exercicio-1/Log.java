public class Log {

    private Log(){};

    private static Log instancia = null;

    public static Log getInstance(){
        if(instancia==null){
            instancia = new Log();
        }
        return instancia;
    }

    public void escreva(String mensagem){
        System.out.print(mensagem);
    }
}