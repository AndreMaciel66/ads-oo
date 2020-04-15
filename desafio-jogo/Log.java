public class Log {
    // PODE SER UM SINGLETON
    // 1º - Deixo o Construtor Privado
    private Log() {}
    //2º - Criar objeto estático da classe
    private static Log instancia = null;
    //3º - Criar o método estático que 'pega' o Objetico
    public static Log getInstancia() {
      if (instancia == null) {
        instancia = new Log();
      }
      return instancia;
    }
  
    public void escrever(String mensagem) {
      
      System.out.println(mensagem);
    }
  }